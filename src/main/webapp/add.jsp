<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<h3>添加页面</h3>
	<form action="add" method="post" enctype="multipart/form-data">
		商品名称:<input type="text" name="gname"><br><br>
		英文名称:<input type="text" name="gname2"><br><br>
		商品品牌:<select name="bid" id="brand">
			   		<option value="0">请选择</option>
			   </select><br><br>
		商品种类:<select name="gsid" id="kind">
			   		<option value="0">请选择</option>
			   </select><br><br>
		尺寸:<input type="text" name="gsize"><br><br>
		单价(元):<input type="text" name="priject"><br><br>
		数量:<input type="text" name="gnum"><br><br>
		照片:<input type="file" name="file"><br><br>
		<input type="submit" value="添加">
	</form>
</body>
<script type="text/javascript">
	$.post("questlist",function(r){
		var brand = r.brands;
		var kind = r.goodskind;
		
		var str="";
		for(var i in brand){
			str+="<option value='"+brand[i].bid+"'>"+brand[i].bname+"</option>";
		}
		
		
		var str2="";
		for(var i in kind){
			str2+="<option value='"+kind[i].gsid+"'>"+kind[i].gsname+"</option>";
		}
		
		$("#brand").html(str);
		$("#kind").html(str2);
	},"json")
	
	
</script>
</html>