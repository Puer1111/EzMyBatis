package com.EZ.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EZ.member.service.MemberService;
import com.EZ.member.vo.Member;

/**
 * Servlet implementation class MypageServlet
 */
@WebServlet("/member/mypage.kh")
public class MypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MypageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// 세션에서 아이디가져오기 -> 로그인한 사용자에 한해서 마이페이지 정보를 가져올 수 있음.
			HttpSession session = request.getSession();
			String memberId = (String) session.getAttribute("memberId");
//			String memberId = request.getParameter("memberId");
			if (memberId != null && !"".equals(memberId)) {
				MemberService mService = new MemberService();
				Member member = mService.selectOneById(memberId);
				if (member != null) {
					request.setAttribute("member", member);
					request.getRequestDispatcher("/WEB-INF/views/member/mypage.jsp").forward(request, response);

				} else {
					request.setAttribute("msg", "존재하지않습니다");
					request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "존재하지않습니다");
				request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}

	}
}