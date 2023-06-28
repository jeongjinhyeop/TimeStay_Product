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
    <main>
      <jsp:include page ="../views/navigationbar.jsp"></jsp:include>
      <div class="content">
        <h1></h1>
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
                <label><input type="checkbox" id="cboxAll" name="cboxAll"  checked>전체</label>
                </li>
                <c:forEach var="aa" items="${cate}" varStatus="pc" begin="0" step="1">
                 <li><label><input type="checkbox"  name="${cate[pc.index]}" class="cbox" checked>${cate[pc.index]}</label></li>
                </c:forEach>
              </ul>      
          </div>
        </div>
        <div class="product">
            <c:forEach var="bakery" items="${pv}" varStatus="vs" begin="0" step="1">
              <div class="product_b ${cate[vs.index]}" name="${cate[vs.index]}">
                <p>${cate[vs.index]}</p>
                <ul>
                  <c:forEach var="item" items="${bakery}" varStatus="va">
                      <li>
                        <dl><a href="${pageContext.request.contextPath}/product${item.pcategorySub}/${item.ptitle}"><img src="../../resources/images/${item.pimage}" alt=""></a></dl>  
                        <dt>${item.ptitle}</dt>
                      </li>
                    </c:forEach>  
                </ul>
              </div>
            </c:forEach>  
        </div>
      </div>
    </main>
    <jsp:include page ="../views/quickMenu.jsp"></jsp:include>
    <jsp:include page ="../views/footer.jsp"></jsp:include>
    <%@ include file="../../resources/js/Product.js" %>
</body>
</html>