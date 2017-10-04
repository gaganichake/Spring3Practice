<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Company</title>
</head>
<body>
<table width="768" border="0" align="left" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="3" align="left" valign="top"><%@ include file="header.jsp"%></td>
  </tr>
  <tr>
    <td width="20%" align="left" valign="top"><jsp:include page="manu.jsp" />&nbsp;</td>
    <td width="1%" align="left" valign="top" bgcolor="#4B85AD">&nbsp;</td>
    <td width="79%" height="500" align="left" valign="top">
       <c:choose>
   		<c:when test="${employeeModel.employee != null}"><div><table class="border" width="100%" border="0" cellspacing="3" cellpadding="1">
              <tr>
                <th colspan="2" align="left" scope="col">Employee -</th>
                </tr>
              
              <tr>
                <th align="left" scope="col"><strong>Name</strong></th>
                <td>${employeeModel.employee.name}</td>
          </tr>
              <tr>
                <td align="left"><strong>Password</strong></td>
                <td>${employeeModel.employee.password}</td>
          </tr>
              <tr>
                <td align="left"><strong>Username</strong></td>
                <td>${employeeModel.employee.username}</td>
          </tr>
              <tr>
                <td align="left"><strong>Phone</strong></td>
                <td>${employeeModel.employee.phone}</td>
          </tr>
              <tr>
                <td align="left"><strong>Email</strong></td>
                <td>${employeeModel.employee.email}</td>
          </tr>
              <tr>
                <td align="left"><strong>Department</strong></td>
                <td>${employeeModel.employee.department}</td>
          </tr>
              <tr>
                <td align="left"><strong>Role</strong></td>
                <td>${employeeModel.employee.rolename}</td>
          </tr>
              
            </table>
      <div>
      </c:when>
      	</c:choose>
<div><table class="border" width="100%" border="0" cellspacing="3" cellpadding="1">
  <tr>
    <th colspan="2" align="left" scope="col">Employee List -</th>
    </tr>
  <tr>
    <td align="left"><strong>Name</strong></td>
    <td><strong>Role</strong></td>
  </tr>
  <c:forEach items="${employeeModel.employeeList}" var="employee"  varStatus="i" >
  <tr>
    <td class="color" align="left"><a href="${pageContext.request.contextPath}/Employee/Show" title="Show" target="_self">${employee.name}</a></td>
    <td>${employee.rolename}</td>
  </tr>
  </c:forEach>
</table>
</div>
</td>
  </tr>
  
  <tr>
    <td height="1" colspan="3" align="left" valign="top" bgcolor="#4B85AD">&copy; Company, All Rights Reserved</td>
  </tr>
</table>
</body>
</html>