<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/wlib/jquery-ui-1.8.9/lightness/jquery-ui-1.8.9.custom.css">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/wlib/jquery-ui-1.8.9/lightness/jquery-ui.css">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/wlib/jqgrid-3.8.2/ui.jqgrid.css">
		
		<script type="text/javascript" src="<%=request.getContextPath()%>/wlib/jquery-1.4.2/jquery-1.4.2.min.js" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/wlib/jquery-plugins/jquery.all-plugin.min.js" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/wlib/jquery-ui-1.8.9/jquery-ui-1.8.9.custom.min.js" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/wlib/jqgrid-3.8.2/i18n/grid.locale-cn.js" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/wlib/jqgrid-3.8.2/jquery.jqGrid.min.js" />
		<title>Index</title>
		<script type="text/javascript" charset="UTF-8">
			var listUrl = "stu/showStu.do";
			$().ready(function() {
				//查询结果列表
				$("#gridTable").gridUtil().simpleGrid({
					url: listUrl,
					editurl:"#deleteUrl",
					sortname:'id',
					sortorder:'desc',
					multiselect:false,
		 	        shrinkToFit: false,
			        autowidth:true,
					colNames:[
					          'ID', 
							   'name',
							   'age',
							   'sex'
							   ],
					colModel:[
							    {name : 'id', 			index :'id',hidden: true},
							    {name : 'name', 	index:'name'},
							    {name : 'age', 		index:'age'},
							    {name : 'sex', 		index:'sex'}
							    
					],
					pager: "#gridPager",
					toolbar: [true,"top"],
					caption: "AAAAAAAA",
					gridComplete: function() {
						var ids = $("#gridTable").jqGrid('getDataIDs');
					}
				});

				$("#gridTable").gridUtil().customizeColumn();
				$("#gridToolbar").appendTo($("#t_gridTable"));

				
				// input blur event for trimming
// 				$("#queryField input").input().trim();
// 				$("#queryField input").input().enter(doSearch);
				
			});
		</script>
	</head>
<body>
	<a href="<%=basePath%>stu/listStudent.do">进入用户管理页</a><br>
	<a href="<%=basePath%>stu/showStu.do">进入Student</a><br>
	
	<table id="gridTable">
	</table>
	<div id="gridPager"></div>
	
	
</body>
</html>