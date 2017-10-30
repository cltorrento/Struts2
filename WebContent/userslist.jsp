<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>System Users List</title>

<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>

</head>
<body>
<h2>Struts 2 (CRUD) using JDBC</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>First Name</th>
						<th>SurName</th>
						<th>User Name</th>
						<th>Email</th>
						<th>Password</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="name" /></td>
						<td><s:property value="surname" /></td>
						<td><s:property value="username" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="passwd" /></td>
						<td>
							<a href="updatedetails.action?submitType=updatedata&email=<s:property value="email"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?email=<s:property value="email"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
		<a href="index.jsp">Back</a>
	</div>
</body>
</html>