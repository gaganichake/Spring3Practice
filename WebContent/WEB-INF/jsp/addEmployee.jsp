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
    <td width="20%" align="left" valign="top"><jsp:include page="manu.jsp"/>&nbsp;</td>
    <td width="1%" align="left" valign="top" bgcolor="#4B85AD">&nbsp;</td>
    <td width="79%" height="500" align="left" valign="top"><div><form method="post" action="${pageContext.request.contextPath}/Employee/Add">
        <table width="100%" border="0" cellspacing="3" cellpadding="1">
          <tr>
            <td colspan="2" align="left" valign="top"><strong>Add Emplooyee (Try with HTML <em>form</em>) -</strong></td>
            </tr>
          <tr>
            <td align="left" valign="top"><strong>Name</strong></td>
            <td align="left" valign="top"><input name="name" type="text"></td>
          </tr>            
          <tr>
            <td width="39%" align="left" valign="top"><strong>Username</strong></td>
            <td width="61%" align="left" valign="top"><input name="username" type="text"></td>
          </tr>
          <tr>
            <td align="left" valign="top"><strong>Password</strong></td>
            <td align="left" valign="top"><input name="password" type="password"></td>
          </tr>

          <tr>
            <td align="left" valign="top"><strong>Phone</strong></td>
            <td align="left" valign="top"><input name="phone" type="text"></td>
          </tr>
          <tr>
            <td align="left" valign="top"><strong>Email</strong></td>
            <td align="left" valign="top"><input name="email" type="text"></td>
          </tr>
          <tr>
            <td align="left" valign="top"><strong>Department ID</strong></td>
            <td align="left" valign="top"><select name="depid">
            	<option value="1">administration</option>
                <option value="2">network</option>
                <option value="3">sales</option>
                <option value="4">engineering</option>
            </select></td>
          </tr>
          <tr>
            <td align="left" valign="top"><strong>Role ID</strong></td>
            <td align="left" valign="top"><select name="roleid">
            	<option value="1">manager</option>
           		<option value="2">employee</option>               
             </select></td>
          </tr>
          <tr>
            <td align="left" valign="top">&nbsp;</td>
            <td align="left" valign="top"><input type="submit"/>&nbsp;<input type="reset"/></td>
          </tr>
        </table>
        </form>
    </div>
    </td>
  </tr>
  
  <tr>
    <td height="1" colspan="3" align="left" valign="top" bgcolor="#4B85AD"><%@ include file="footer.jsp"%></td>
  </tr>
</table>
</body>
</html>