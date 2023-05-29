<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="TimeStay.TimeStay_Product.vo.ProductVO" %>
<%@ include file="../views/global.jsp" %>
<% List<ProductVO> productList = (List<ProductVO>)request.getAttribute("productList"); %>
<% ProductVO pcategory = (ProductVO)request.getAttribute("pcategory"); %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TIME STAY</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="../../resources/css/Product.css" type="text/css"/>


</head>
<body>
    <%@ include file="../views/navigationbar.jsp" %>
    <div class="content">
        <h1>${pcategory.getPcategory()}</h1>
        <div class="product_kind_wrap"> 
          <div class="product_menu_top">
            <h2>분류 보기</h2>
            <div class="product_menu_button">
              <img src="../../resources/images/list_up_btn.png" alt="분류보기 메뉴 접기" style="height: 42px;">
            </div>
          </div>
          <div class="proudct_toggle_wrap">
            <hr class="hr">
              <ul>
                <li>
                <label><input type="checkbox" name="product_all" >전체</label>
                </li>
                <li><label><input id="pb1" type="checkbox" class="pb" name="product_b"  checked>${pcategory.getPcategory()}</label></li>
              </ul>      
          </div>
        </div>
        <div class="product">
          <div class="product_b">
            <p>${pcategory.getPcategory()}</p>
            <ul>
              <%for(ProductVO vo : productList){ %>
                <li>
                  <dl><a><img src="../../resources/images/<%=vo.getPimage() %>" alt=""></a></dl>
                  <dt><%=vo.getPtitle() %></dt>     				 
                </li>
                 <%}%>		
                 <li>
                 <dl></dl>
                 <dt></dt>     				 
              </li>

            </ul>
          </div>
        </div>
      </div>
           <div class="quickmenu">
          <div><a href="#"></a></div>
          <div></div>
        </div>
        <%@ include file="../../resources/js/Product.js" %>
        <%@ include file="../views/quickMenu.jsp" %>
</body>
</html>