<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberWeb Home</title>
</head>
<body>
	<h1>환영합니다 MemberWeb Home 입니다</h1>
	<c:if test="${memberId ne null}">
	${memberName}님 환영합니다.
	<a href="/member/logout.kh">로그아웃</a>
	<a href="/member/mypage.kh">마이페이지</a>
	</c:if>
	<c:if test="${memberId eq null}">
	<form action="/member/login.kh" method="post">
		<fieldset>
			<legend>로그인</legend>
			ID: <input type="text" name="memberId"> <br> 
			PW: <input type="password" name="memberPw"> <br> 
			<input type="submit" value="로그인">
		</fieldset>
	</form>
	<a href="/member/join.kh">회원가입</a>
</c:if>
</body>
</html>