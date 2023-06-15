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
    <link rel="stylesheet" href="../../resources/css/ProductReview.css" type="text/css"/>


    <div class="tabs">
    <div role="tablist" aria-labelledby="tablist-1" class="automatic">
      <button id="tab-1" type="button" role="tab" aria-selected="true" aria-controls="tabpanel-1">
        <span class="focus">공지사항</span>
      </button>
      <button id="tab-2" type="button" role="tab" aria-selected="false" aria-controls="tabpanel-2" tabindex="-1">
        <span class="focus">상품리뷰</span>
      </button>
      <button id="tab-3" type="button" role="tab" aria-selected="false" aria-controls="tabpanel-3" tabindex="-1">
        <span class="focus">Q&A</span>
      </button>
    </div>            
    <div id="tabpanel-1" role="tabpanel" tabindex="0" aria-labelledby="tab-1">
      <h3>공지사항</h3>
      <div>내용</div>
    </div>
    <div id="tabpanel-2" role="tabpanel" tabindex="0" aria-labelledby="tab-2" class="is-hidden">
      <div>
        <div class="product_review">
          <h3>상품리뷰</h3>
          <div class="modal">
            <div class="modal_body">
              <div class="modal_close"><button class="modal_close_btn"><img src="${pageContext.request.contextPath}/resources/images/cancle.png" alt=""></button></div>
              <h2>리뷰작성</h2>
                <f:form modelAttribute="review" action="${ reviewsPath }" method="post">
                    <f:textarea path="text" cssClass="form-control" rows="5" />
                    <f:label path="rating">평점: </f:label>
                    <f:select path="rating">
                        <f:options items="${ratingOptions }"/>
                    </f:select>
                    <f:hidden path="bookId" />
                    <f:hidden path="userId" />
                    <button class="btn btn-block btn-primary" type="submit">리뷰 등록</button>
                </f:form>
                <button>작성</button>                  
            </div>           
          </div> 
           <div class="modal2">
                <div class="modal_body2">
                <div class="modal_close2"><button class="modal_close_btn2"><img src="${pageContext.request.contextPath}/resources/images/cancle.png" alt=""></button></div>
                <h2>리뷰수정</h2>
                    <button>수정</button>                  
                
                </div>           
            </div>                                     	                  
            <c:if test="${login != null }">	                                      
                <button class="btn-open-popup">리뷰작성</button>
            </c:if>
        </div>
      </div>
      <table class="pd_review">
        <tr>
          <th style="width: 10%;">번호</th>
          <th style="width: 45%;">내용</th>
          <th style="width: 15%;">평점</th>
          <th style="width: 15%;">작성자</th>
          <th style="width: 15%;">작성일</th>
        </tr>
          <!--  표현식을 jstl에서 인식을 하지 못하므로 표현식을 jstl 반복문으로 변경해주면 된다. -->
        <c:forEach var='lrvo' items='${lrvo}'>
           
            <tr>
            <td>123</td>
            <td>
                <c:if test="${login != null }">	 
                    <form>
                        <input type="hidden" value="${lrvo.getPidx()}">
                        <input type="hidden" value="${lrvo.getRidx()}">          
                        <c:if test="${login.getMidx() eq lrvo.getMidx()}">
                             <button type="button" class="btn-open-popup2" data-value="${lrvo.getRidx()}" data-score="${lrvo.getRscore()}">리뷰수정</button>
                        </c:if>
                    </form>
                    <form name="delfrm" action="<%=request.getContextPath() %>/Product/ProductReviewDelete.do" method="post">
                        <input type="hidden" name="Ridx" value="${lrvo.getRidx()}">
                        <input type="hidden" name="Pidx" value="${lrvo.getPidx()}">
                        <button>리뷰삭제</button>
                    </form>
                </c:if>
                
            </td>
            <table class="table table-stripped" id="reviews">
                <thead>
                    <tr>
                        <th>Rating</th> <!-- 평점 -->
                        <th>User</th>
                        <th>Text</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="review" items="${ reviews }" varStatus="status">
                        <!-- 평점 기준 별표시 출력 -->
                        <tr>
                            <td><c:forEach var="rating" items="${ ratingOptions }" varStatus="status" begin="1" end="${ review.rating }">★</c:forEach></td>
                            <td>익명</td>
                            <td>${ review.text }</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            </tr>
        </c:forEach>			       
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
</div>
<div class="quickmenu">
  <div><a href="#"><img src="${pageContext.request.contextPath}/resources/images/free-icon-up-arrow-3042413.png" alt="위로가기"></a></div>
  <div><a href="<%=request.getContextPath()%>/Shopping/Cart.do"><img src="${pageContext.request.contextPath}/resources/images/shopping-cart.png" alt="장바구니"></a></div>
</div>
</div>