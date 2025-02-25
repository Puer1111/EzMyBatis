package com.EZ.notice.vo;

import java.sql.Timestamp;

public class Notice {
	private int noticeNo;
	private String noticeSubject;
	private String noticeContent;
	private String noticeWriter;
	private Timestamp regDate;
	private Timestamp updateDate;
	private int viewCount;

	public Notice() {
	}

	public Notice(String noticeSubject, String noticeContent, String noticeWriter) {
		super();
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeWriter = noticeWriter;
	}

	public Notice(int noticeNo, String noticeSubject, String noticeContent) {

		this.noticeNo = noticeNo;
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
	}

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}

	public String getNoticeWriter() {
		return noticeWriter;
	}

	public void setNoticewriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeSubject=" + noticeSubject + ", noticeContent=" + noticeContent
				+ ", noticeWriter=" + noticeWriter + ", regDate=" + regDate + ", updateDate=" + updateDate
				+ ", viewCount=" + viewCount + ", getNoticeSubject()=" + getNoticeSubject() + ", getNoticeContent()="
				+ getNoticeContent() + ", getNoticeNo()=" + getNoticeNo() + ", getNoticeWriter()=" + getNoticeWriter()
				+ ", getRegDate()=" + getRegDate() + ", getUpdateDate()=" + getUpdateDate() + ", getViewCount()="
				+ getViewCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
