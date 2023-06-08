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
					
				if ($("input[name=cboxAll]").is(":checked")==true)
					{
						$("input[type=checkbox]").prop("checked", true);
						$(".product_b").css("display","block");
						
					}
				else if ($("input[name=cboxAll]").is(":checked")==false)
					{
						$("input[type=checkbox]").prop("checked", false);
						$(".product_b").css("display","none");
					}
			})
		});
{/* 체크박스 카테고리 버튼 */}
$(function(){ 
	$("input[type=checkbox]").change(function(){
		var name = $(this).attr('name');
		var cbox = $("."+name);  
		console.log(name) 
		console.log(cbox)
		console.log($("input[name='"+name+"']"))
		var cboxAll = $("input[name='cboxAll']:checked");
		if($("input[name='"+name+"']").is(":checked")==false){
		$("."+name).css("display","none");
		}else if($("input[name='"+name+"']").is(":checked")==true) {
			console.log(22)
		$("."+name).css("display","block");
		}
		var cbox =$(".cbox:checked")
		if(cbox.length!=2){
			$("input[name=cboxAll]").prop("checked",false)
		}else {
			$("input[name=cboxAll]").prop("checked",true)
		}
		
	})
})
</script>
