<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<h2>마이페이지 개설 중입니다.</h2>
	<form action="/member/update.kh" method="post">
		<input type="hidden" name="memberId"value="${member.memberId }">
		<!-- updateServlet에서 request.getParameter는 input type 밖에 못 가져와서 만듬 -->
		아이디:<span>${member.memberId }</span>
		<!-- 비밀번호:<input type ="text" value="member-Pw"> -->
		이름: <span>${member.memberName }</span><br>
		성별: <span>${member.gender }</span><br>
		나이: <span>${member.age }</span><br>
		이메일: <input type="text" name="email" value="${member.email }"><br>
		전화번호: <input type="text" name="phone" value="${member.phone }"><br>
		주소: <input type="text" name="address" value="${member.address }"><br>
		취미:<input type="text" name="hobby" value="${member.hobby }"><br>
		가입일자: <span>${member.regdate }</span>
		<input type="submit" value="수정하기">
		<br>
		</form>
		<a href="#" onclick="checkdelete();">회원탈퇴</a>
		<script>
		function checkdelete(){
			// /member/remove.kh?memberId=${memberId}
			if(confirm("정말 지우실건가요?")){
			}else{
				location.href("/member/remove.kh?memberId=${memberId}");
			}
		}
		</script>
		</form>
	</body>
</html>