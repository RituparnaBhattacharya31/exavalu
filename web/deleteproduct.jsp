<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Delete Product</title>
</head>
<body>
	<h2>Simple CURD Using STRUTS2 FRAMEWORK</h2>
         <jsp:include page="menu.jsp" />
	<span><s:property value="msg" /></span><br><br>
	<a href="reportproduct">
		<button type="button">Report Delete</button>
	</a>
</body>
</html>