<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
					  $("#s2").append("<option  value='"+obj[i].b_id+"'>"+obj[i].b_name+"</option>")	  			
			   }
		  }
		  
	  })
	  $.ajax({
		  url:"getTList.do",
		  dataType:"json",
		  type:"post",
		  success:function(objj){
			  for ( var i in objj) {
				$("#s1").append("<option  value='"+objj[i].t_id+"'>"+objj[i].t_name+"</option>")
			}
		  }
	  })
})
</script>
</head>
<body>
	<form method="post" action="add.do" >
      <table>
         <tr>
         <td>商品名称</td>
         <td><input type="text" name="s_name1"></td>
       </tr>
         <tr>
         <td>英文名称</td>
         <td><input type="text" name="s_name2"></td>
       </tr>
         <tr>
         <td>商品品牌</td>
         <td>
         <select id="s2" name='b_id' >
	       <option value=""></option>
	     </select>
         </td>
       </tr>
       <tr>
          <td>商品种类</td>
          <td>
          <select id="s1" name='t_id' >
	       <option value=""></option>
	     </select>
          
          </td>
       </tr>
        <tr>
         <td>尺寸</td>
         <td><input type="text" name="s_size"></td>
       </tr>
        <tr>
         <td>单价(元)</td>
         <td><input type="text" name="s_price"></td>
       </tr>
         <tr>
         <td>数量</td>
         <td><input type="text" name="s_num"></td>
       </tr>
         <tr>
         <td>标签</td>
         <td><input type="text" name="s_label"></td>
       </tr>
       <tr>
        <td>商品图片上传</td>
        <td><input type="text" name="s_photo"></td>
       </tr>
       <tr>
       <td colspan="222"><input type="submit" value="提交"></td>
       </tr>
      </table>
   </form>
</body>
</html>