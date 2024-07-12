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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/member/update.kh")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		try {
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			String hobby = request.getParameter("hobby");
			String memberId = request.getParameter("memberId");
			Member member = new Member(email,phone,address,hobby,memberId);
//			세션에 있는 값이랑 같은 지 체크 후 비즈니스 로직 진행
			HttpSession session = request.getSession();
			String sMemberId=(String)session.getAttribute("memberId");
			if(sMemberId!=null && sMemberId.equals(memberId)) {
				MemberService mService = new MemberService();
				int result = mService.updateMember(member);
				if(result>0) {
					response.sendRedirect("/member/mypage.kh?memberId="+memberId);
				}else {
					request.setAttribute("msg", "수정되지 않았습니다");
					request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
				}
			}
		}catch(Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
		}
		
	}

