<%@page import="util.JDBConnect"%>
<%@page import="dao.ReviewDao"%>
<%@page import="dto.Review"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db 연결과 쿼리 테스트</title>
</head>
<body>
	<%

	ReviewDao dao = new ReviewDao(application);
	ArrayList<Review> rlist = dao.selectbyCafe(2);
	for (Review e : rlist) {
		out.print(e);

	}
	%>
</body>
</html>