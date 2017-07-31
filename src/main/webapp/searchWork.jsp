<%-- 
    Document   : searchWork
    Created on : 30 juil. 2017, 23:40:32
    Author     : mrubrice
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Search a Work</title>
</head>
	<body>
		<form method="GET" action="searchWork">
            <table>
                <tr>
                    <th>Search a work</th>
                </tr>
                <tr>
                    <td><i>idWork : <input type="text" name="idWork" size="25" /></i></td>
                </tr>
                <tr>
                    <td>
                        <input class="button" type="submit" value="Submit" />
                        <input class="button" type="reset" value="Reset" />
                    </td>
                </tr>
            </table>
        </form>		
	</body>
</html>
