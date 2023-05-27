
<script>
    //분류보기 
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