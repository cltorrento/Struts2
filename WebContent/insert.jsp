<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New User</title>

<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>

</head>
<body>
	<h2>Struts 2 (CRUD) using JDBC</h2>
	<a href="userslist.jsp"><button class="button-report" type="button">User List</button></a>
	<s:form action="registeruser" method="post">
		<s:textfield label="First Name" name="firstname" />
		<s:textfield label="Surname" name="surname" />
		<s:textfield label="Username" name="username" />
		<s:textfield label="Email" name="email" />
		<s:password label="Password" name="passwd" />
		<s:submit cssClass="button-register" value="Add User" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>