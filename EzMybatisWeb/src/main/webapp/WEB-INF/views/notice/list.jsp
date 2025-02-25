<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<style>
table {
	width: 800px;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<h1>공지사항 목록</h1>
	<table>

		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${nList }" var="notice">
			<tr>
				<td>${notice.noticeNo}</td>
				<td><a href="/notice/detail.kh?noticeNo=${notice.noticeNo }">${notice.noticeSubject}</a></td>
				<td>${notice.noticeWriter }</td>
				<td>${notice.regDate }</td>
				<td>${notice.viewCount }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>