<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Testing Strust2 - Cltorrento</title>
</head>
<body>
	<s:form action="saludoDelForm">
		<h1>Struts 2 (CRUD) using JDBC</h1>
		<a href="insert.jsp">Add New User</a></br>
		<a href="userslist.jsp">User List</a>
	</s:form>
</body>
</html>