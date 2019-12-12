<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="uft-8">
<meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>员工信息</title>
<!-- 引入JQuery -->
<script  type="text/javascript" src="${APP_PATH}/static/js/jquery-2.0.0.min.js"></script>
<!-- 引入layui前端框架 -->
<link rel="stylesheet" href="${APP_PATH}/static/layui/css/layui.css">
<script src="${APP_PATH}/static/layui/layui.js"></script>
<script src="${APP_PATH}/static/js/mylayui.js"></script>
</head>
<body>
	

	 
	  <table id="ScheClass" lay-filter="text" class="layui-table"></table>  
	  
	<script type="text/javascript">
	 /*   $(function(){
		  $.ajax({
			url:"${APP_PATH}/getscheClass",
			dataType:"json",
			type:"GET",
			success:function(result){
				console.log(result.extend.ScheClass.list);
			}
		  });
	   }); */
	
		 layui.use('table', function(){
		  var table = layui.table;
		  
		  //第一个实例
		  table.render({
		    elem: '#ScheClass',
		    url:"${APP_PATH}/getscheClass",
		    parseData: function(res) { //res 即为原始返回的数据
		    	console.log("111");
		    	console.log(res.extend.ScheClass.list);
	            return {
	                "code": res.code, //解析接口状态
	                "msg": res.msg, //解析提示文本
	                "data": res.extend.ScheClass.list //解析数据列表
	            }
	        },
		    height: 312,
		    page: true, //开启分页
		    cols: [[ //表头
		      {field: 'classid', title: '班号',sort: true} 	
		      ,{field: 'workclass', title: '班种', sort: true}
		      ,{field: 'starttime', title: '上班时间', sort: true}
		      ,{field: 'endtime', title: '打卡时间', sort: true} 
		    ]]	
		  
		  }); 
	

		 
		}); 
		
	</script>
	
	
		
</body>
</html>