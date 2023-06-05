<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="quickmenu">
        <div><a href="#"><img src="../../resources/images/free-icon-up-arrow-3042413.png" alt="위로가기"></a></div>
        <div><a href="#"><img src="../../resources/images/shopping-cart.png" alt="장바구니"></a></div>
      </div>
      <script>
        $(document).ready(function(){
      var currentPosition = parseInt($(".quickmenu").css("top"));
      $(window).scroll(function() {
        var position = $(window).scrollTop(); 
        $(".quickmenu").stop().animate({"top":position+currentPosition+"px"},10);
       });
      });
      </script>
</body>
</html>