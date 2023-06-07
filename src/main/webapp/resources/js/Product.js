<script>
{/* 분류보기 접기 버튼 */}
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
{/* 체크박스 전체 버튼 */}
$(function(){
			$("input[name=cboxAll]").change(function(){
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
			})
		});
{/* 체크박스 카테고리 버튼 */}
$(function(){
	$("input[name='cbox']").change(function(){
		var cbox = $("input[name='cbox']:checked");
		var cboxAll = $("input[name='cboxAll']:checked");
		for(var i =0; i<$("input[name='cbox']").length; i++){
			if(cbox.length == 2){
				$('input:checkbox[name="cboxAll"]').prop("checked",true)
				$(".product_b").css("display","block");
			}else if(cbox.length==1) {	
				$('input:checkbox[name="cboxAll"]').prop("checked",false)
				$(".product_b").css("display","none");
				$($(".product_b")[cbox.val()]).css("display","block");
			}else if(cbox.length==0){
				$('input[type="checkbox"]').prop("checked",false)
				$(".product_b").css("display","none");
				}
			}
		})
	});

	
         
</script>