
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
              }) 
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
    
              })
            });
  
          
         
    </script>