<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Student" %>
<html>
<head>
<title>Students Master list</title>
</head>
<body>
<h2>View master list of all the students</h2>
<%
try {
/* Create string of connection url within specified format with machine
name, port number and database name. Here machine name id localhost and 
database name is LearnersAcademy. */
String connectionURL = "jdbc:mysql://localhost:3306/LearnersAcademy"; 
// declare a connection by using Connection interface
Connection connection = null;
/* declare object of Statement interface that is used for executing sql 
statements. */
Statement statement = null;
// declare a resultset that uses as a table for output data from tha table.
ResultSet rs = null;
// Load JBBC driver "com.mysql.jdbc.Driver"
Class.forName("com.mysql.cj.jdbc.Driver"); 
//.newInstance();
/* Create a connection by using getConnection() method that takes parameters 
of string type connection url, user name and password to connect to database.*/
connection = DriverManager.getConnection(connectionURL, "root", "Manchester7");
/* createStatement() is used for create statement object that is used for 
sending sql statements to the specified database. */
statement = connection.createStatement();
// sql query to retrieve values from the secified table.
String QueryString = "SELECT * from Students";
rs = statement.executeQuery(QueryString);
%>
<center><TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getInt(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
</TR>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
</font>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}
%>


<TABLE>
<TR>
<TD><FORM ACTION="SuccessServlet" method="get" >
<button type="submit"><-- back</button></TD>
</TR>
</TABLE>
</font>
</body>
</html>