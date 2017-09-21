<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP list page. 4<br>
    
    <form action="user/multiquery.do" method="post">
       id<input type="text" name="user.uid"> 
       name<input type="text" name="user.username"> 
       password<input type="text" name="user.password"><br>
       maxresult<input type="text" name="maxresult"><br>  
      <input type="submit">
    </form> 
    <hr>
   === updateall====
      <form action="user/updateall.do" method="post">
  
    <c:forEach items="${userlist}" var="user" varStatus="status">
      	<input type="text" value="${user.uid}" name="userList[${status.index}].uid" />
      	<input type="text" value="${user.username}" name="userList[${status.index}].username" />
      	<input type="text" value="${user.password}" name="userList[${status.index}].password" />
     <br>
      
    </c:forEach>
    
    <input type="submit" value="批量修改">
    </form>
    
    <hr>
    
     <form action="user/deleteall.do" method="post">
  
    <c:forEach items="${userlist}" var="user">
      <input type="checkbox" value="${user.uid}" name="ids"/>${user.uid}|${user.username}|${user.password} <br>
      
    </c:forEach>
    
    <input type="submit" value="批量删除">
    </form> 
    
    
  
  </body>
</html>
