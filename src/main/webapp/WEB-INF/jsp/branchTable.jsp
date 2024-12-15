<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  taglib uri="http://www.springframework.org/tags/form" prefix="f" %>  
<!DOCTYPE html>
<html>
<head>
<link
  rel="stylesheet"
  href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
>
<style>
header{
	text-align: center;
}
h2{
	text-align: center;
}
div {
	width:600px;
	margin:auto;
}
</style>
<meta charset="UTF-8">
<title>Branch Table</title>
</head>
<header><a href="/branchForm">Create New Branch</a></header>
<body>
<h2>Branch Table</h2>
<table>
<tr><th>Branch Id</th><th>Branch Name</th><th>Address</th><th>Update/Delete</th></tr>
<c:forEach items="${branches}" var="branch">
<tr>
<td>${branch.getBranchId()}</td><td>${branch.getBranchName()}</td>
<td>${branch.getBranchAddress().getAddressLine1()}, ${branch.getBranchAddress().getAddressLine2()}, 
${branch.getBranchAddress().getCity()}, ${branch.getBranchAddress().getState()}, 
${branch.getBranchAddress().getZipcode()}, ${branch.getBranchAddress().getPhoneNumber()}</td>
<td><a href="/deleteBranchById/${branch.getBranchId()}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>