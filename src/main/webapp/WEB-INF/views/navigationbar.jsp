<header id="header" class="deactive">        
    <nav class="navbar">
        <div class="navbar_menu">
            <div id="title"> 
                <h4><a href="<%= request.getContextPath() %>/">TIME STAY</a></h4>
            </div>
            <ul>
                <li><a href="<%= request.getContextPath() %>/About/About_us.do">카페소개</a>
                    <div class="sub">
                        <ul>
                            <li><a href="<%= request.getContextPath() %>/About/About_us.do">Time stay</a></li>
                            <li><a href="<%= request.getContextPath() %>/About/Location.do">오시는 길</a></li>
                            <li><a href="<%= request.getContextPath() %>/About/Gallery.do">갤러리</a></li>
                        </ul>
                    </div>
                </li>
                <li><a href="#">메  뉴</a>
                    <div class="sub">
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Product/ProductDessert.do">제과</a></li>
                            <li><a href="${pageContext.request.contextPath}/Product/ProductDrink.do">음료</a></li>
                            <li><a href="${pageContext.request.contextPath}/Product/ProductFood.do">음식</a></li>
                            <li><a href="${pageContext.request.contextPath}/Product/ProductCoffeeBean.do">원두</a></li>
                        </ul>
                    </div>
                </li>
                <li><a href="#">EVENT</a>
                    <div class="sub">
                        <ul>
                               <li><a href="<%=request.getContextPath()%>/Event/EventNowEvent.do">진행중 이벤트</a></li>
                            <li><a href="<%=request.getContextPath()%>/Event/EventEndEvent.do">종료된 이벤트</a></li>
                            <li><a href="#"></a></li>
                        </ul>
                    </div>
                </li>
                <li><a href="#">공지사항</a>
                    <div class="sub">
                        <ul>
                            <li><a href="<%=request.getContextPath()%>/Board/BoardNotice.do">공지사항</a></li>
                            <li><a href="<%=request.getContextPath()%>/Board/BoardFaq.do">자주 묻는 질문</a></li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>          
    </nav>    
     
      <c:if test= "${login==null}">
          <ul class="navbar_links">
             <li><a href="#" onclick="return false;" id="modal_btn">로그인</a></li>	    
            <li><a href="<%=request.getContextPath()%>/Member/Login.do">장바구니</a></li>
            <li><a href="<%=request.getContextPath()%>/Board/BoardFaq.do">고객센터</a></li>
        </ul>
    </c:if>
     <c:if test ="${login!=null}">
        <ul class="navbar_links" style="width:330px;">
            <li><a href="<%=request.getContextPath()%>/Member/logout.do" style="padding:0 4px">로그아웃</a></li>
            <li><a href="<%=request.getContextPath()%>/MyPage/member_Modify.do?Mid=${Mid}" style="padding:0 4px">마이페이지</a></li>
            <li><a href="<%=request.getContextPath()%>/Shopping/ShoppingCart.do" style="padding:0 4px">장바구니</a></li>
            <li><a href="<%=request.getContextPath()%>/Board/BoardFaq.do" style="padding:0 4px">고객센터</a></li>
        </ul>
      </c:if>   

</header>


<script>
    //분류보기 
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
    
             function click1() {
                const text1 = document.getElementById("text1");
                const text2 = document.getElementById("text2");
    
                text1.style = "none";
                text2.style = "none";
    
                text1.style.color = "red";
                text1.style.textDecoration = "underline";
    
                $("#news_container").animate({ paddingLeft: "-500px" }, 1800);
            }
            function click2() {
                const text1 = document.getElementById("text1");
                const text2 = document.getElementById("text2");
    
                text1.style = "none";
                text2.style = "none";
    
                text2.style.color = "red";
                text2.style.textDecoration = "underline";
    
                $("#news_container").animate({ paddingLeft: "500px" }, 1000);
            }
    
            // 스크롤 시 header 색변화 fade-in
            $(function(){
                $(document).on('scroll', function(){
                    if($(window).scrollTop() > 100){
                        $("#header").removeClass("deactive");
                        $("#header").addClass("active");
                    }else{
                        $("#header").removeClass("active");
                        $("#header").addClass("deactive");
                    }
                })
    
            });
            //체크박스 설정
            $(function (){
              $("#pb1").click(function (){
              //	 $(".product_b").toggle();
                var check1 = $("input[name=product_b]").is(":checked")
    
                if(check1== true){
                  $(".product_b").css("display","block");
                  $("input[name=product_all]").prop("checked",true);
                }else if(check1 ==false){
                  $(".product_b").css("display","none");
                  $("input[name=product_all]").prop("checked",false)
                  }
              }); 
            });
    
            $(function (){
              $("input[name=product_all]").click(function (){
                var check1 = $("input[name=product_b]").is(":checked")
                var checkall = $("input[name=product_all]").is(":checked")
                if(checkall== true){
                  $(".product_b").css("display","block");
                  $("input[name=product_b]").prop("checked",true)
                }else if(checkall ==false){
                  $(".product_b").css("display","none");
                  $("input[name=product_b]").prop("checked",false)
                }
    
              }); 
            });
          //퀵메뉴
          $(document).ready(function(){
          var currentPosition = parseInt($(".quickmenu").css("top"));
          $(window).scroll(function() {
            var position = $(window).scrollTop(); 
            $(".quickmenu").stop().animate({"top":position+currentPosition+"px"},10);
           });
          });
    
    
          // 스크롤 시 header 색변화 fade-in
          $(function(){
              $(document).on('scroll', function(){
                  if($(window).scrollTop() > 100){
                      $("#header").removeClass("deactive");
                      $("#header").addClass("active");
                  }else{
                      $("#header").removeClass("active");
                      $("#header").addClass("deactive");
                  }
              })
          });   
          
          //로그인 팝업창
          window.onload = function() {     
              function onClick() {
                  document.querySelector('.modal_wrap').style.display ='block';
                  document.querySelector('.black_bg').style.display ='block';
              }   
              function offClick() {
                  document.querySelector('.modal_wrap').style.display ='none';
                  document.querySelector('.black_bg').style.display ='none';
              }
          
              document.getElementById('modal_btn').addEventListener('click', onClick);
              document.querySelector('.modal_close').addEventListener('click', offClick);     
          };
         
    </script>