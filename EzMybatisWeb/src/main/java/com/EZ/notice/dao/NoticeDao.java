package com.EZ.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.EZ.notice.vo.Notice;

public class NoticeDao {

	public int insertNotice(SqlSession conn, Notice notice) {
		int result = conn.insert("NoticeMapper.insertNotice",notice);
		return result;
	}

	public List<Notice> selectList(SqlSession conn) {
	List<Notice>nList = conn.selectList("NoticeMapper.selectList");
		return nList;
	}

	public Notice selectOne(int noticeNo, SqlSession conn) {
		Notice result = conn.selectOne("NoticeMapper.selectOne",noticeNo);
		return result;
	}



	public int UpdateNotice(SqlSession conn, Notice notice) {
	int result = conn.update("NoticeMapper.UpdateNotice",notice);
		return result;
	}

	public int deleteNotice(SqlSession conn, int noticeNo) {
		int result = conn.delete("NoticeMapper.deleteNotice",noticeNo);
		return result;
	}
}
