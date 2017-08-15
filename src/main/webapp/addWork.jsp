<%-- 
    Document   : addWork
    Created on : 30 juil. 2017, 23:59:54
    Author     : mrubrice
--%>

<%@ page contentType="text/html;charset=ISO-8859-1" language="java"%>
<html>
<head>
    <title>Add a Work</title>
</head>
<body>
	<h1>Add a Work</h1>
	<form method="POST" action="AddWokServlet">
		<table>
			<tr>
				<th>Work</th>
			</tr>
			<tr>
				<td><i>Title: <input type="text" name="title"/></i></td>
			</tr>
			<tr>
				<td><i>Form: <input type="text" name="form"/></i></td>
			</tr>
			<tr>
				<td><i>Date: <input type="date" name="date"/></i></td>
			</tr>
			<tr>
				<td><i>Context: <input type="text" name="context"/></i></td>
			</tr>
                        <tr>
				<td><i>Distinct Characteristic: <input type="text" name="characteristic"/></i></td>
			</tr>
                        <tr>
				<td><i>intende Audience: <input type="text" name="audience"/></i></td>
			</tr>
                        <tr>
				<td><i>Place : <input type="text" name="place" /></i></td>
			</tr>
                        <tr>
				<td><i>Object : <input type="text" name="identifier" /></i></td>
			</tr>
                        
		</table>
                <table>
                            <tr>
                                    <th>Work's person</th>
                            </tr>
                            <tr>
                                    <td><i>Name : <input type="text" name="nameP" /></i></td>
                            </tr>
                            <tr>
                                    <td><i>Designation : <input type="text" name="desig" /></i></td>
                            </tr>
                            <tr>
                                    <td><i>Title : <input type="text" name="titleP" /></i></td>
                            </tr>
                            <tr>
                                    <td><i>Date : <input type="date" name="dateP" /></i></td>
                            </tr>
                </table>
		<input class="button" type="submit" value="Submit" />
                <input class="button" type="reset" value="Reset" />
	</form>
</body>
</html>

