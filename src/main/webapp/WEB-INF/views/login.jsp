<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>My sample login form</title>
</head>
<body>
<h1 align="center"  "Please Identify your self.." >

${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method="post">
    <table align="center">
        <tr>
            <td bgcolor="#faebd7">User:</td>
            <td><input type="text" name="username" value='' ></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" value='' ></td>
        </tr>
        <tr>

            <td><input name="submit" type="submit" value="submit" ></td>
        </tr>
    </table>
</form>
</form>
</body>
</html>