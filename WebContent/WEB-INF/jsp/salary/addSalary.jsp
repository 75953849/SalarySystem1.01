<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>表格</title>
    <base href="<%= request.getServletContext().getContextPath()%>/">
	<link rel="shortcut icon" href="img/favicon.ico">
	<!-- Bootstrap3.3.5 CSS -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- datatime -->
	<link href="bootstrap/css/bootstrap-datetimepicker.min.css"
		rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath }/js/jquery-1.8.0.js"></script>
	<script type="text/javascript">
		function EmpJson(){
			var eid = $("#empId").val();
			$.ajax({
				url:"${pageContext.request.contextPath}/EmpJson",
				type:"post",
				data:JSON.stringify({empId:eid}),
				contentType:"application/json;charset=UTF-8",
				dataType:"json",
				success:function(data){
					$("#message").text("");
					if(data != null&&data.id!=null){
						
						$("#empName").attr("value",data.name);
						
						$("#depName").attr("value",data.depName);
						
						$("#depId").attr("value",data.depId);
						
						$("#baseSalary").attr("value",data.salary);
						
						$("#sub").removeAttr("disabled");
					}	
					
				},
				error:function(){
				
					$("#message").text("编号不存在");
					$("#sub").attr("disabled",true);
				}
			
			});
		}

		</script>
	
	
</head>

<body>
	<div class="row">
	    	<jsp:include page="/header.jsp"></jsp:include>
		<div id="content" class="col-md-10 col-xs-10 col-sm-10"
			style="padding-top: 0; margin: 0;">
			<div id="ftdiv">
				<!-- <form class="form-horizontal" action="addEmp" method="post" enctype="multipart/form-data"> -->
				<form class="form-horizontal" action="addSalary" method="post"
					enctype="application/x-www-form-urlencoded">
					<fieldset>
						<legend>添加薪资信息</legend>
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">职工编号:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="empId" id="empId" class="form-control" onblur="EmpJson()">
								<span id="message"></span>
							</div>

						</div>
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">职工姓名:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="empName" id="empName" class="form-control">
		
							</div>

						</div>
						
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">部门编号:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="depId" id="depId" class="form-control">
								
							</div>

						</div>
						
						
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">部门名:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="depName" id="depName" class="form-control">
								
							</div>

						</div>
						
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">工资日期:</label>
							<div class="col-md-4 col-xs-4 col-sm-4 input-append date"
								id="datetimepicker1" data-date-format="yyyy-mm-dd">
								<input class="form-control" size="16" type="text"
									name="salTime"> <span
									class="add-on form-control-feedback"><i
									class="icon-th glyphicon glyphicon-calendar"></i></span>
							</div>
						</div>
						
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">基本薪资:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="baseSalary" id="baseSalary" class="form-control">
								
							</div>

						</div>
						
						
						
							<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">加班费:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="overtimePay" class="form-control">
								
							</div>

						</div>
						
						
							<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">请假费:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="leaveFee" class="form-control">
								
							</div>

						</div>
						
							<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">缺勤费:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="absentPay" class="form-control">
		
							</div>

						</div>
						
						
						
						<!-- <div class="form-group">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">头     像:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="file" name="icon">
							</div>
					</div> -->
					</fieldset>
					
					<div class="form-group col-md-7 col-xs-7 col-sm-7"
						style="text-align: center;">
						<input type="submit" id="sub" class="btn btn-success" value="提 交" />
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/jquery-3.2.1.min.js "></script>
	<script src="bootstrap/js/bootstrap.min.js "></script>
	<script type="text/javascript" src="js/date.js"></script>
	<script type="text/javascript"
		src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript"
		src="bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="js/menu.js"></script>
	<script>
		$(function() {
			$('#datetimepicker1').datetimepicker({
				format : 'yyyy-mm-dd',
				autoclose : true,
				minView : 2
			});
			$('#datetimepicker2').datetimepicker({
				format : 'yyyy-mm-dd',
				autoclose : true,
				minView : 2
			});
			var d = new Date();
			$("span>input[type='text']").val(d.toDefineString());
		});
	</script>
</body>

</html>

