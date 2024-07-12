package com.EZ.notice.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.EZ.common.SqlSessionTemplate;
import com.EZ.notice.dao.NoticeDao;
import com.EZ.notice.vo.Notice;

public class NoticeService {
	NoticeDao nDao;
	SqlSession conn;

	public NoticeService() {
		nDao = new NoticeDao();
		conn = SqlSessionTemplate.getSqlSession();
	}

	public int insertNotice(Notice notice) {
		int result = nDao.insertNotice(conn, notice);
		return result;
	}

	public List<Notice> selectAllNotice() {
		List<Notice> nList = nDao.selectList(conn);
		return nList;
	}

}
