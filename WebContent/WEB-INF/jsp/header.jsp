<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<img src="${pageContext.request.contextPath}/images/company_header.jpg" alt="Company" width="768" height="139">
<div style="width: 100%"><table width="100%"><tr>
	<td align="left">Response time : ${handlingTime} ms</td>
	<td align="right"><form name="LanguageForm" action="${pageContext.request.contextPath}/Locale" method="post">
		<select name="language" onchange="document.forms['LanguageForm'].submit();">
			<option value="en" <c:choose><c:when test="${pageContext.response.locale eq 'en'}">selected="selected"</c:when></c:choose>>English</option>
			<option value="es" <c:choose><c:when test="${pageContext.response.locale eq 'es'}">selected="selected"</c:when></c:choose>>Spanish</option>
		</select></form></td></tr></table></div>