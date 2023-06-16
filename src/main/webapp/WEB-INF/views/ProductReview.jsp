<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="form" %>
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
    <link rel="stylesheet" href="../../resources/css/ProductReview.css" type="text/css"/>
      
</head>
<body>
  <div class="tabs">
    <div role="tablist" aria-labelledby="tablist-1" class="automatic">
      <button id="tab-1" type="button" role="tab" aria-selected="true" aria-controls="tabpanel-1">
        <span class="focus">Notice</span>
      </button>
      <button id="tab-2" type="button" role="tab" aria-selected="false" aria-controls="tabpanel-2" tabindex="-1">
        <span class="focus">Review</span>
      </button>
      <button id="tab-3" type="button" role="tab" aria-selected="false" aria-controls="tabpanel-3" tabindex="-1">
        <span class="focus">Q&A</span>
      </button>
    </div>            
    <div id="tabpanel-1" role="tabpanel" tabindex="0" aria-labelledby="tab-1">
      <h3>Notice</h3>
      <div>내용</div>
    </div>
    <div id="tabpanel-2" role="tabpanel" tabindex="0" aria-labelledby="tab-2" class="is-hidden">
        <div class="product_review">
          <h3>Review</h3>
          <div class="modal">
            <div class="modal_body">
              <div class="modal_close"><button class="modal_close_btn"><img src="${pageContext.request.contextPath}/resources/images/cancle.png" alt=""></button></div>
              <h2>Review</h2>
              <span class="star-input">
                <span class="input">
                    <input type="radio" name="Rscore" value="1" id="p1">
                    <label id="p1" for="p1">1/5</label>
                    <input type="radio" name="Rscore" value="2" id="p2">
                    <label id="p2" for="p2">2/5</label>
                    <input type="radio" name="Rscore" value="3" id="p3">
                    <label id="p3" for="p3">3/5</label>
                    <input type="radio" name="Rscore" value="4" id="p4">
                    <label id="p4" for="p4">4/5</label>
                    <input type="radio" name="Rscore" value="5" id="p5">
                    <label id="p5" for="p5">5/5</label>
                  </span>
                  <output for="Rscore"><b>0/5</b></output>						
              </span>
              <textarea placeholder="리뷰를 작성해주세요"></textarea>
              <button>작성</button>                  
            </div>           
          </div>                    
          <button class="btn-open-popup">리뷰작성</button>
        </div>
      <table class="pd_review">
        <tr>
          <th style="width: 10%;">글 번호</th>
          <th style="width: 45%;">내용</th>
          <th style="width: 15%;">평점</th>
          <th style="width: 15%;">작성자</th>
          <th style="width: 15%;">작성일</th>
        </tr>
      </table>
    </div>
    <div id="tabpanel-3" role="tabpanel" tabindex="0" aria-labelledby="tab-3" class="is-hidden">
    <h3>반품/환불</h3>
    <h3>교환 및 환불 안내</h3>
    <div></div>
    <h3>반품 보내실 주소</h3>
    <div></div>
    <h3>교환/환불 정책</h3>
    <div></div>
    </div>
  </div>
  <%@ include file="../../resources/js/ProductReview.js" %>
</body>

</html>