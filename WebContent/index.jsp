<%@page import="cm.zls.chart.bar.BarChart"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="zh">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<%
	String fileName = BarChart.getPieChart(session);
%>
</head>
<body>
<img src="DisplayChart?filename=<%=fileName%>" width="700" height="500" border="0" />
</body>
</html>