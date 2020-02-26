<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/css.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			  url:"getBList.do",
			  dataType:"json",
			  type:"post",
			  success:function(obj){
				  for ( var i in obj) {
						  $("#s2").append("<option  value='"+obj[i].b_name+"'>"+obj[i].b_name+"</option>")	  			
				   }
			  }
			  
		  })
		  $.ajax({
			  url:"getTList.do",
			  dataType:"json",
			  type:"post",
			  success:function(objj){
				  for ( var i in objj) {
					$("#s1").append("<option  value='"+objj[i].t_name+"'>"+objj[i].t_name+"</option>")
				}
			  }
		  })
	})
	
	function fenye(pageNum){
		alert(pageNum);
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	
	function tj(){
		location="toAdd";
	}
</script>
</head>
<body>
	<form action="/list" method="post">
		<input type="hidden" name="pageNum">
		<input type="button" value="添加" onclick="tj()">
		&nbsp;&nbsp;
		种类<select id="s1" name="t_name">
			<option value=""> </option>
		</select>
		品牌<select id="s2" name="b_name">
			<option value=""></option>
		</select>
		单价范围<input type="text" name="p1">
		到<input type="text" name="p2">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<select >
			<option>商品名称</option>
		</select>
		<input type="text" name="s_name1">
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价(元)</td>
			<td>数量</td>
			<td>标签</td>
			<td>图片</td>
		</tr>
		<c:forEach items="${page.list }" var="c" varStatus="count">
			<tr>
				<td>${count.count+page.startRow-1}</td>
				<td>${c.s_name1}</td>
				<td>${c.s_name2}</td>
				<td>${c.b_name}</td>
				<td>${c.t_name}</td>
				<td>${c.s_size}</td>
				<td>${c.s_price}</td>
				<td>${c.s_num}</td>
				<td>${c.s_label}</td>
				<td>${c.s_photo}</td>
			</tr>
			
		</c:forEach>
		<tr >
			<td colspan="20">
				<button onclick="fenye(${page.prePage==0?'1':page.prePage})">上一页</button>
				<button onclick="fenye(1)">1</button>
				<button onclick="fenye(2)">2</button>
				<button onclick="fenye(3)">3</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				共${page.pages }页,跳到<input type="text" onblur="fenye(this.value)">
			</td>
		</tr>
	</table>
</body>
</html>