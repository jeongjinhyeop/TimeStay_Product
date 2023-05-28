<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%  List<ProductVO> test = (List<ProductVO>)request.getAttribute("test"); %>
<%@ page import="TimeStay.TimeStay_Product.vo.ProductVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(ProductVO vo : test){%>
   <h1>1. <%= vo.getPidx()%></h1>
   <%}%>
<h1>ㄱㄱ</h1>
</body>
</html>