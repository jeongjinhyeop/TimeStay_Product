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
    <link rel="stylesheet" href="../../resources/css/ProductDetail.css" type="text/css"/>


</head>
<body>
    <jsp:include page ="../views/navigationbar.jsp"></jsp:include>
    <main> 
	    <div class="section">
	      <div class="section1">
	        <div class="product_info_container">
  			   <form style="display: flex; width: 90%; height: 100%; align-items: center;" action= "" method="get">  
              <c:forEach var="pi" items="${pitem}">
                <div class="product_img">
                  <img src="../../resources/images/${pi.pimage}" >
                  <input type="hidden" name="Pimage" value="">
                  <input type="hidden" name="Pidx" value="">
                </div>
                <div class="product_info">
                  <div class="product_info1">
                    <ul>
                      <li><strong>${pi.ptitle}</strong></li>
                      <li style="border-bottom:1px solid #000; width:100%; padding-bottom: 10px;"></li>
                      <li><p>유통기한:</p>  구매일로부터 몇일</li>
                      <li><p>보관방법:</p> 냉장or 냉동</li>
                      <li><p>배송비:</p>  3000원</li>
                      <!-- <input type="hidden" name="delivery_fee" value=3000> -->
                      <li>
                        <p>수령방법:</p>
                        <input type="radio" name="delivery" value="택배" checked>택배 &nbsp; 
                        <input type="radio" name="delivery" value="방문포장">방문포장 &nbsp; 
                        <input type="radio" name="delivery" value="예약">예약
                      </li>
                    </ul>
                  </div>
                  <div class="selected_optionbox">
                    <div class="selected_option1">
                      <span>상품명:${pi.ptitle}</span>
                      <input type="hidden" name="Ptitle" value="">
                      <div class="spinnerBox">
                        <div class="selected_option2" >
                          <input id="Svol" name="Svol" type="number" value=1 min=1>
                        </div>
                      </div>  
                    </div>
                  </div>
                  <div class="total1" >총상품금액:<p class="totalSum">${pi.pprice}</p></div>
                  <input type="hidden" name="totalSum" value="${pi.pprice}">
                  <input type="hidden" name="Pprice" value="${pi.pprice}">
                  <%@ include file="../../resources/js/ProductDetail.js" %>
                  </div>          
                </div>
                
             </c:forEach>
	      	  </form>  
           </div>
         </div>
	      <!-- <div class="section2">
	         
	    </div> -->
    </main>
    <jsp:include page ="../views/quickMenu.jsp"></jsp:include>
    


</body>
</html>