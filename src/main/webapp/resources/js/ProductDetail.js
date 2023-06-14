<script>
	$(function(){
		$("input[name=Svol]").on ("propertychange change keyup paste",function(){     
		var Svol = $("input[name=Svol]").val();
		var ProductPrice = ${pi.pprice}*(Svol);
		
		$(".totalSum").html(ProductPrice);
		$("input[name=totalSum]").val(ProductPrice);
		$('input[name=Svol]').val(Svol);
		})
	})
</script>
