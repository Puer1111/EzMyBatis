package com.EZ.member.service;

import org.apache.ibatis.session.SqlSession;

import com.EZ.common.SqlSessionTemplate;
import com.EZ.member.dao.MemberDao;
import com.EZ.member.vo.Member;

public class MemberService {

	private SqlSession conn;
	private MemberDao mDao;
	
	public MemberService() {
		conn = SqlSessionTemplate.getSqlSession();
		mDao = new MemberDao();
	}
	
	public int insertMember(Member member) {
		int result = mDao.insertMember(conn,member);
		
		return result;
	}

	public Member checkLogin(Member member) {
	Member result = mDao.checkLogin(conn,member);
		return result;
	}

	public Member selectOneById(String memberId) {
	Member result = mDao.selectOneById(conn,memberId);
		return result;
	}

	public int deleteMember(String memberId) {
		int result = mDao.deleteMember(conn,memberId);
		return result;
	}

	public int updateMember(Member member) {
		int result = mDao.updateMember(conn,member);
		return result;
	}

}
