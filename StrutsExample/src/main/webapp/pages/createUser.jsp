<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
    <title>Create User</title>
</head>
<body>
    <h2>Create User</h2>
    <html:form action="/createUser" method="POST">
        <table>
            <tr>
                <td>Name:</td>
                <td><html:text property="name"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><html:text property="email"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <html:submit value="Create"/>
                </td>
            </tr>
        </table>
    </html:form>
</body>
</html>
