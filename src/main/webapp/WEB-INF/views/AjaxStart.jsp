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
		$("#loadBtn").click(function(){
			$("#display").load("load");//load라는 요청이 있다.
		})
		////////////////////////////
		$("#ajaxBtn").click(function(){
			$.ajax({
				url: "ajax",//서버요청주소
				type: "get",//요청방식 get,post,put,delete,patch
				dataType:"text",//서버가 보내온 데이터 타입 text,html,xml,json
				data: "name=김소은",//server에게 보낼 parameter정보
				success:function(result){
					$("#display").html("<h3>"+result+"</h3>");
				},
				error:function(err){
					console.log(err+"예외 발생....")
				}
				
			});
		})
		//////////////////////////////////////
		$("#jsonArr").click(function(){
			$.ajax({
				url: "jsonArr",//서버요청주소
				type: "post",//요청방식 get,post,put,delete,patch
				dataType:"json",//서버가 보내온 데이터 타입 text,html,xml,json
				//data: "name=김소은",//server에게 보낼 parameter정보
				success:function(result){
					var str="";
					$.each(result,function(index,item){
						//alert(item)
						str+="<input type='checkbox' value='"+index+"'>"+item
					});
					$("#display").html(str);
				},
				error:function(err){
					console.log(err+"예외 발생....")
				}
				
			});
		});
		/////////////////////////
		$("#jsonDto").click(function(){
			$.ajax({
				url: "jsonDto",//서버요청주소
				type: "post",//요청방식 get,post,put,delete,patch
				dataType:"json",//서버가 보내온 데이터 타입 text,html,xml,json
				//data: "name=김소은",//server에게 보낼 parameter정보
				success:function(result){
					//alert(result)
					var str = result.id+" | "+result.age +" | "+result.id+" | "+result.name;
					$("#display").html(str);
				},
				error:function(err){
					console.log(err+"예외 발생....")
				}
				
			});
			
		});
		//////////////////////////////////////////
		$("#jsonList").click(function(){
			$.ajax({
				url: "jsonList",//서버요청주소
				type: "post",//요청방식 get,post,put,delete,patch
				dataType:"json",//서버가 보내온 데이터 타입 text,html,xml,json
				//data: "name=김소은",//server에게 보낼 parameter정보
				success:function(result){
					var str="<table>";
					str+="<tr><td>ID</td><td>Name</td><td>Age</td><td>Addr</td></tr>"
					//alert(result)
					$.each(result,function(index,item){
						//alert(item);
						str+="<tr><td>";
						str+=item.name+"</td>";
						str+="<td>";
						str+=item.id+"</td>";
						str+="<td>";
						str+=item.age+"</td>";
						str+="<td>";
						str+=item.addr+"</td></tr>";
						
					})
					$("#display").html(str);
					str="</table>";
				},
				error:function(err){
					console.log(err+"예외 발생....")
				}
				
			});
		})
		//////////////////////////
		$("#jsonMap").click(function(){
			$.ajax({
				url: "jsonMap",//서버요청주소
				type: "post",//요청방식 get,post,put,delete,patch
				dataType:"json",//서버가 보내온 데이터 타입 text,html,xml,json
				//data: "name=김소은",//server에게 보낼 parameter정보
				success:function(result){
					alert(result.message)
					alert(result.pageNumber)
					alert(result.dto+" , "+result.dto.id+" , "+result.dto.name)
					alert(result.list)
					$.each(result.list,function(index,item){
						alert(item.id+" , "+item.name+" , "+item.age+" , "+item.addr)
					})
				},
				error:function(err){
					console.log(err+"예외 발생....")
				}
			});
		})
		///////////////////////////////////////////////
		
	})//ready
</script>
</head>
<body>

<input type="button" value="load함수" id="loadBtn">
<input type="button" value="ajax함수" id="ajaxBtn">

<input type="button" value="Array결과" id="jsonArr">
<input type="button" value="DTO결과" id="jsonDto">
<input type="button" value="List결과" id="jsonList">
<input type="button" value="Map결과" id="jsonMap">

<hr>
<div id="display"></div>



</body>
</html>



