
<script>
$(function (){
                  $(".product_menu_button").click(function (){
                    $(".proudct_toggle_wrap").toggle();
                  var src= $(".product_menu_button>img").attr("src");
                  if(src == '../../resources/images/list_up_btn.png'){
                    $(".product_menu_button>img").attr("src","../../resources/images/list_down_btn.png");
                  }else{
                    $(".product_menu_button>img").attr("src","../../resources/images/list_up_btn.png");
                  }
                })
                });

$(function(){
			$("input[name=cboxAll]").click(function(){
				if ($("input[name=cboxAll]").prop("checked"))
					{
						$("input[name='cbox']").prop("checked", true);
						$(".product_b").css("display","block");
					}
				else
					{
						$("input[name='cbox']").prop("checked", false);
						$(".product_b").css("display","none");
					}
			});
		});

$(function(){
	$("input[name=cbox]").click(function(){
			if($("input[name='cbox']:checked").length == 2){
				$('input:checkbox[name="cboxAll"]').prop("checked",true)
				$(".product_b").css("display","block");
				}else if($("input[name='cbox']:checked").length != 2){
					$('input:checkbox[name="cboxAll"]').prop("checked",false)
					$(".product_b").css("display","none");
				}
			})
		});
	
	
	$(function(){
	$("input[name=cbox]").click(function(){
			if($("input[name='cbox']:checked").length == 1&& $("#checkbox1").prop("checked",true)){
				$(".product_b:first-child").css("display","block");
				$(".product_b:last-child").css("display","none");
				}else if($("input[name='cbox']:checked").length == 1){
				$(".product_b:first-child").css("display","none");
				$(".product_b:last-child").css("display","block");
					
				}else{	
					$(".product_b").css("display","none");
				}
			})
		});
	
         
</script>