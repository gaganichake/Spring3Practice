<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="768" border="0" align="left" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="3" align="left" valign="top"><%@ include file="header.jsp"%></td>
  </tr>
  <tr>
    <td width="20%" align="left" valign="top"><jsp:include page="manu.jsp" />&nbsp;</td>
    <td width="1%" align="left" valign="top" bgcolor="#4B85AD">&nbsp;</td>
    <td width="79%" height="500" align="left" valign="top"><div>
    <p><strong><spring:message code="aboutUs.title"/></strong></p>
          <p><spring:message code="aboutUs.message1"/></p>
          <p><spring:message code="aboutUs.message2"/></p>
          <ul>
            <li>Java</li>
            <li>JSP</li>
            <li>Servlet</li>
            <li>Spring 3 MVC (Model View Controller)</li>
            <li>Annotation</li>
          </ul></div></td>
  </tr>  
  <tr>
    <td height="1" colspan="3" align="left" valign="top" bgcolor="#4B85AD">&copy; Company, All Rights Reserved</td>
  </tr>
</table>
</body>
</html>