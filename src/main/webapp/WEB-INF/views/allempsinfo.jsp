<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息</title>
<% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>
<!-- 引入JQuery -->
<script  type="text/javascript" src="${APP_PATH}/static/js/jquery-2.0.0.min.js"></script>
<!-- 引入layui前端框架 -->
<link rel="stylesheet" href="${APP_PATH}/static/layui-v2.3.0/layui/css/layui.css">
<script src="${APP_PATH}/static/layui-v2.3.0/layui/layui.js"></script>
</head>
<body>
    <button type="button" class="layui-btn layui-btn-fluid">流体按钮（最大化适应）</button>
	<div class="layui-container">
	    <div class="layui-row">
		    <div class="layui-col-md9">
		       <h3>所有员工信息</h3>
		    </div>    
        </div>
        <div class="layui-row">
		     <table id="tbl_emp" lay-filter="test"></table>
			<script>
			layui.use('table', function(){
			  var table = layui.table;
			  
			  //第一个实例
			  table.render({
			    elem: '#tbl_emp'
			    ,height: 312
			    ,url: '${APP_PATH}/emps/getemps/' //数据接口
			    ,page: true //开启分页
			    ,cols: [[ //表头
			      {field: 'emp_id', title: 'ID', width:80, sort: true, fixed: 'left'}
			      ,{field: 'emp_name', title: '用户名', width:80}
			      ,{field: 'gender', title: '性别', width:80, sort: true}
			      ,{field: 'phonenum', title: '电话', width:177} 
			      ,{field: 'address', title: '住址', width: 177}
			      ,{field: 'emp_degree', title: '职位', width: 80, sort: true}
			      ,{field:'department',title:'部门',width:50}
			    ]]
			  });
			  
			});
			
			
			//查出所有部门信息显示在下拉列表中
			function getDepts(){
				$.ajax({
					url:"${APP_PATH}/depts",
					type:"GET",
					success:function(result){
						//console.log(result);
					}
				})
			}
			
			$("#emp_save_btn").click(function(){
				//1.提交服务器
				//2.发送ajax请求
				$.ajax({
					url:"${APP_PATH}/addemp",
					type:"POST",
					data:$("#empAddModal form").serialize(),
					success:function(result){
						alert(result.msg);
					}
				})
			});
			
			$(document).on("click",".edit_btn",function(){
				//1.查出员工信息，显示员工信息
				
			})
			
			function getEmp(){
				$.ajax({
					url:"${APP_PATH}/getemp/"+id,
					type:"GET",
					success:function(result){
						
					}
				});
			}
			</script>
        </div>
	</div>
</body>
</html>