<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>

<script type="text/javascript">
  $(function(){
	
	  
  })
  

</script>
</head>
<body>
<h3> [ Suggest 기능 구현 ]</h3>	
<form name="search" id="search">
	<input type="text" name="word" id="keyWord"/>
	<input type="button" value="검색"/>	
</form>
<!--제시어 단어 출력부분 -->
<div id="suggest" style="display:none">
 

</div>

</body>
</html>








