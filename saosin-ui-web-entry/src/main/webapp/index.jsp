<%@ page language="java" pageEncoding="UTF-8"%>
<%
    RequestDispatcher rd = request.getRequestDispatcher("/view/mainframe.jsp");
    rd.forward(request,response);
%>