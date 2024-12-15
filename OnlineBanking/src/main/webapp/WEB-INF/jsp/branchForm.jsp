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
<title>Branch Form</title>
</head>
<header><a href="/branchTable">See All Branches</a></header>
<body>
<h2>Branch Form</h2>
<div>
	<f:form action="/createBranch" method="POST" modelAttribute="branch">
		<f:label path="branchId">Branch Id:</f:label><f:input type="text" path="branchId"/>
		<f:label path="branchName">Branch Name:</f:label><f:input type="text" path="branchName"/>
		<f:label path="branchAddress.addressLine1">Address Line 1:</f:label><f:input type="text" path="branchAddress.addressLine1"/>
		<f:label path="branchAddress.addressLine2">Address Line 2:</f:label><f:input type="text" path="branchAddress.addressLine2"/>
		<f:label path="branchAddress.city">City:</f:label><f:input type="text" path="branchAddress.city"/>
		<f:label path="branchAddress.state">State:</f:label><f:input type="text" path="branchAddress.state"/>
		<f:label path="branchAddress.country">Country:</f:label><f:input type="text" path="branchAddress.country"/>
		<f:label path="branchAddress.zipcode">Zipcode:</f:label><f:input type="text" path="branchAddress.zipcode"/>
		<f:label path="branchAddress.phoneNumber">Phone Number:</f:label><f:input type="text" path="branchAddress.phoneNumber"/>
		<input type="submit"  value="Submit"/>
	</f:form>
</div>
</body>
</html>