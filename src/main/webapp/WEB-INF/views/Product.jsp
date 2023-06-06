<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="TimeStay.TimeStay_Product.vo.ProductVO" %>
<%@ include file="../views/global.jsp" %>
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
    <jsp:include page ="../views/navigationbar.jsp"></jsp:include>
    <div class="content">
        <h1>${pcategory[0].pcategory}</h1>
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
                <label><input type="checkbox" id="cboxAll" name="cboxAll"  >전체</label>
                </li>
                <li><label><input type="checkbox" name="cbox" id="checkbox1" >${pcategory[0].pcategory}</label></li>
                <li><label><input type="checkbox" name="cbox" id="checkbox2" >${pcategory[1].pcategory}</label></a></li>
              </ul>      
          </div>
        </div>
        <div class="product">

            
              <c:forEach var="bakery" items="${pv}" varStatus="vs">
              <div class="product_b">
                <p>${str[vs.index]}</p>
                <ul>
                  <c:forEach var="item" items="${bakery}" varStatus="va">
                      <li>
                        <dl><img src="../../resources/images/${item.pimage}" alt=""></dl>  
                        <dt>${item.ptitle}</dt>
                      </li>
                    </c:forEach>  
                </ul>
              </div>
              </c:forEach>  
            


        </div>
           <div class="quickmenu">
          <div><a href="#"></a></div>
          <div></div>
        </div>
        <jsp:include page ="../views/quickMenu.jsp"></jsp:include>
        <%@ include file="../../resources/js/test.js" %>
        
</body>
</html>