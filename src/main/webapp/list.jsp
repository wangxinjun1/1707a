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
	<table>
		<tr>
			<td colspan="11">
				<a href="add.jsp"><input type="button" value="添加"></a>
			</td>
		</tr>
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价(元)</td>
			<td>数量</td>
			<td>照片</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="g">
		<tr>
			<td>${g.gid}</td>
			<td>${g.gname}</td>
			<td>${g.gname2}</td>
			<td>${g.bname}</td>
			<td>${g.gsname}</td>
			<td>${g.gsize}</td>
			<td>${g.priject}</td>
			<td>${g.gnum}</td>
			<td>
				<img alt="未上传" width="110" height="70" src="lookImg?path=${g.gimg}">
			</td>
			<td>
				<input type="button" value="删除" onclick="del(${g.gid})">
			</td>
		</tr>
		</c:forEach>
	</table>
<script type="text/javascript">
	function del(gid){
		$.post("/del",{"gid":gid},function(r){
			alert("删除成功");
			location.href="list";
		},"json")
	}
</script>
</body>
</html>