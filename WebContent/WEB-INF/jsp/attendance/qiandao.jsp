<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/" %>
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
		<link href="bootstrap/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/sign.css"/>  
    </head>

    <body>
        <div class="row">
			<jsp:include page="/header.jsp"></jsp:include>
            <div id="content" class="col-md-10 col-xs-10 col-sm-10" style="padding-top: 0;margin: 0;">
	           	${msg }
	           	<div style="margin-top: 20px;">
					 <div style="width:300px;height:300px;" id="calendar"></div>  
				</div>
            </div>
        </div>
        <script src="js/jquery-3.2.1.min.js "></script>
        <script src="bootstrap/js/bootstrap.min.js "></script>
        <script type="text/javascript" src="js/date.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>
       	<script type="text/javascript" src="bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
        <script type="text/javascript" src="js/menu.js"></script>
        <script type="text/javascript" src="js/qiandao.js"></script>
		<script type="text/javascript">
			  $(function(){  
			    //ajax获取日历json数据

			    var signList = [];
			    
			    $.ajax({
					url:"${pageContext.request.contextPath}/getSignDay",
					type:"post",
					data:JSON.stringify({year:calUtil.showYear,month:calUtil.showMonth}),
					contentType:"application/json;charset=UTF-8",
					dataType:"json",
					success:function(data){
						for(i in data){
							var a={"signDay":data[i].signDay,"status":data[i].status};
							signList.push(a);
						}

						calUtil.init(signList); 
					},
					error:function(){
					alert("error");
			
					}
				
				});
			    

			    
			     
			  });  
		</script>
    </body>

</html>

<!--  var signList=[{"signDay":"1","status":"1"},{"signDay":"2","status":"1"},
			                  {"signDay":"3","status":"1"},{"signDay":"4","status":"2"}];
			                  
			                  
			                  $.ajax({
			    	url : "${pageContext.request.contextPath}/getSignDay",
			    	type : "post",
			    	data : JSON.stringify({year:"2017",month:"12"}),
			    	contentType : "application/json;charset=UTF-8",
			    	dataType:"json",
			    	success : function(data){
						alert("JSON" + data);
			    			for(i in data){
			    				list1[i] = data[i];
			    				alert("aaa" + list1[i].signDay);
			    				signList["signDay"] = data[i].signDay;
			    				signList["status"] = data[i].status;
			    				alert("aaaaaaaaaaaaaaaaa" + l.signDay);
			    			};
			    			
			    
			    		
			    	}
			    });
			                  
			                  
			                   -->