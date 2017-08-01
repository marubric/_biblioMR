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
	<form method="POST" action="addWork">
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
		<table>
			<tr>
				<th>Work's Expression</th>
			</tr>
			<tr>
                            <td><i>Title : <input type="text" name="titleEx"/></i></td>
                        </tr>
                        <tr>
                            <td><i>Form : <input type="text" name="formEx" /></i></td>
                        </tr>
                        <tr>
                            <td> <i>Date : <input type="date" name="dateEx" /></i></td>
                        </tr>
                        <tr>
                            <td><i>Language : <input type="text" name="langEx" /></i></td>
                        </tr>
                        <tr>
                            <td><i>Distinct Characteristic : <input type="text" name="distEx" /></i></td>
                        </tr>
                        <tr>
                            <td><i>Context : <input type="text" name="contxtEx" /></i></td>
                        </tr>
                        <tr>
                            <td><i>Critical Response : <input type="text" name="criticEx" /></i></td>
                        </td>
			</tr>
		</table>
		<table>
			<tr>
				<th>Expression's Manifestation</th>
			</tr>
			<tr>
			<tr>
				<td><i>Title : <input type="text" name="ttlMa"/></i></td>
			</tr>
			<tr>
				<td><i>Edition : <input type="text" name="editMa" /></i></td>
			</tr>
			<tr>
				<td><i>Statement Responsibility : <input type="text" name="staR" /></i></td>
			</tr>
			<tr>
				<td><i>Publication Place: <input type="text" name="pubPL" /></i></td>
			</tr>
                        <tr>
				<td><i>Publisher: <input type="text" name="publisher" /></i></td>
			</tr>
                        <tr>
				<td><i>Date: <input type="date" name="dtMa"  /></i></td>
			</tr>
                        <tr>
				<td><i>Source Acquisition: <input type="text" name="srcAcq"  /></i></td>
			</tr>
                        <tr>
				<td><i>Type Face: <input type="text" name="typeFace"  /></i></td>
			</tr>
		</table>
		<table>
			<tr>
				<th>Manifestation's item</th>
			</tr>
			<tr>
			<tr>
				<td><i>Identifier : <input type="text" name="identifier" /></i></td>
			</tr>
                        <tr>
				<td><i>Provenance : <input type="text" name="provenance" /></i></td>
			</tr>
                        <tr>
				<td><i>Exibition Date : <input type="date" name="exibitD" /></i></td>
			</tr>
		</table>
		<input class="button" type="submit" value="Submit" /> <input
			class="button" type="reset" value="Reset" />
	</form>
</body>
</html>

