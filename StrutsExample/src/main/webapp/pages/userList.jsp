<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
    <title>List Users</title>
</head>
<body>
    <h2>List of Users</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <logic:iterate id="listUsersId" name="listUsers">
                <tr>
                    <td><bean:write name="listUsersId" property="name"/></td>
                    <td><bean:write name="listUsersId" property="email"/></td>
                </tr>
        </logic:iterate>
    </table>
</body>
</html>
