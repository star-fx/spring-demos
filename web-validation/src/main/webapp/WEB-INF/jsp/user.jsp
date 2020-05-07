<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>User</title>
    </head>
<body>
    <form:form method="POST" action="" modelAttribute="userForm">
        <table border="1">
            <tr>
                <td>Name</td>
                <td>
                    <form:input path="name"/>
                    <font color="red"><form:errors path="name"/></font>
                </td>
            </tr>
            <tr>
                <td>Age</td>
                <td>
                    <form:input path="age"/>
                    <font color="red"><form:errors path="age"/></font>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
