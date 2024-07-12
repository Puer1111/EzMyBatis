package com.EZ.member.dao;



import org.apache.ibatis.session.SqlSession;

import com.EZ.member.vo.Member;

public class MemberDao {

	public int insertMember(SqlSession conn, Member member) {
		int result = conn.insert("MemberMapper.insertMember",member);
		return result;
	}

	public Member checkLogin(SqlSession conn ,Member member) {
		Member result = conn.selectOne("MemberMapper.checkLogin",member);
		return result;
	}

	public Member selectOneById(SqlSession conn ,String memberId) {
		Member result = conn.selectOne("MemberMapper.selectOneById",memberId); 
		return result;
	}

	public int deleteMember(SqlSession conn, String memberId) {
		int result = conn.delete("MemberMapper.deleteMember",memberId);
		return result;
	}

	public int updateMember(SqlSession conn, Member member) {
		int result = conn.update("MemberMapper.updateMember",member);
		return result;
	}
}
