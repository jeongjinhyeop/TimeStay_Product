
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
            //체크박스 설정
				$(function (){
					$("input[name=product_b]").click(function (){
				  //	 $(".product_b").toggle();
				    var check1 = $("input[name=product_b]").is(":checked")
				    var check2 = $("input[name=product_s]").is(":checked")
				    if(check1== true){
				      $(".product_b").css("display","block");
				    }else if(check1 ==false){
				      $(".product_b").css("display","none");
				      $("input[name=product_all]").prop("checked",false)
				      }
				  })
				});
				
				$(function (){
					$("input[name=product_s]").click(function (){
				  //	 $(".product_b").toggle();
				    var check1 = $("input[name=product_b]").is(":checked")
				    var check2 = $("input[name=product_s]").is(":checked")
				    if(check2== true){
				      $(".product_s").css("display","block");
				    }else if(check2 ==false){
				      $(".product_s").css("display","none");
				      $("input[name=product_all]").prop("checked",false)
				      }
				  })
				});
				$(function (){
					$("input[name=product_b]").click(function (){
				  //	 $(".product_b").toggle();
				    var check1 = $("input[name=product_b]").is(":checked")
				    var check2 = $("input[name=product_s]").is(":checked")
				    if(check1==true&&check2== true){
				      $("input[name=product_all]").prop("checked",true)
				      $(".product_s").css("display","block");
				    }
				     })
				});
				$(function (){
					$("input[name=product_s]").click(function (){
				  //	 $(".product_b").toggle();
				    var check1 = $("input[name=product_b]").is(":checked")
				    var check2 = $("input[name=product_s]").is(":checked")
				    if(check1==true&&check2== true){
				      $("input[name=product_all]").prop("checked",true)
				      $(".product_s").css("display","block");
				    }
				     })
				});
				$(function (){
					$("input[name=product_all]").click(function (){
				  //	 $(".product_b").toggle();
				    var check1 = $("input[name=product_b]").is(":checked")
				    var check2 = $("input[name=product_s]").is(":checked")
				    var checkall = $("input[name=product_all]").is(":checked")
				    if(checkall== true){
				      $(".product_s").css("display","block");
				      $(".product_b").css("display","block");
				      $("input[name=product_b]").prop("checked",true)
				      $("input[name=product_s]").prop("checked",true)
				    }else if(checkall ==false){
				      $(".product_s").css("display","none");
				      $(".product_b").css("display","none");
				      $("input[name=product_b]").prop("checked",false)
				      $("input[name=product_s]").prop("checked",false)
				    }
				
				  })
				});
  
          
         
    </script>