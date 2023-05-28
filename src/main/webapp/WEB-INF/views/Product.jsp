<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%@ include file="../views/navigationbar.jsp" %>
    <div class="content">
        <h1>원두</h1>
        <div class="product_kind_wrap"> 
          <div class="product_menu_top">
            <h2>분류 보기</h2>
            <div class="product_menu_button">
              
            </div><!--사과 이미지 바꾸는거 참고--> 
          </div>
          <div class="proudct_toggle_wrap">
            <hr class="hr">
              <ul>
                <li>
                <label><input type="checkbox" name="product_all" >전체</label>
                  <!-- <label for="product_all">전체</label> -->
                </li>
                <li><label><input id="pb1" type="checkbox" class="pb" name="product_b"  checked>원두</label></li>
              </ul>      
          </div>
        </div>
        <div class="product">
          <div class="product_b">
            <p>원두</p>
            <ul>
            
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
        
   <script>
		$(function (){
		  $(".product_menu_button").click(function (){
		    $(".proudct_toggle_wrap").toggle();
		  var src= $(".product_menu_button>img").attr("src");
		  if(src == '${pageContext.request.contextPath}/resources/images/list_up_btn.png'){
		    $(".product_menu_button>img").attr("src","${pageContext.request.contextPath}/resources/images/list_down_btn.png");
		  }else{
		    $(".product_menu_button>img").attr("src","${pageContext.request.contextPath}/resources/images/list_up_btn.png");
		  }
		}); 
		});

   </script>
</body>
</html>