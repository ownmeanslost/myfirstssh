<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>填写必要信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="scripts/bootstrap/css/bootstrap.min1.css"></link>
<link rel="stylesheet" type="text/css"
	href="scripts/bootstrap/css/bootstrap-datetimepicker.min.css"></link>
<link rel="stylesheet" type="text/css"
	href="scripts/bootstrap/css/summernote.css"></link>
	
<link rel="stylesheet" type="text/css"
	href="scripts/bootstrap/css/fileinput.min.css"></link>	
<jsp:include page="/WEB-INF/scripts/common/common.jsp"></jsp:include>

<script type="text/javascript"
		src="scripts/bootstrap/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript"
		src="scripts/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript"
		src="scripts/bootstrap/js/summernote.min.js"></script>
	<script type="text/javascript"
		src="scripts/bootstrap/js/summernote-zh-CN.js"></script>
		<script type="text/javascript"
		src="scripts/bootstrap/js/fileinput.js"></script>
		<script type="text/javascript"
		src="scripts/bootstrap/js/fileinput_locale_zh.js"></script>
</head>
<script type="text/javascript">
	var model={};
	(function(){
	model.resumeGuid=" <c:out default='' value='${resumeGuid}'/>";
	})();
	
</script>
<body>

	<h1 class="container">请填写简历上信息</h1>
	<br />


	<div class="container">
		<form class="form-horizontal" role="form" id="form1">
			<button type="button"
				class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
				<span class="glyphicon glyphicon-user"></span> 个人信息
			</button>
			<div class="form-group">
				<label for="name" class="col-sm-2 col-xs-12 control-label">姓名</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="name"
						placeholder="请输入名字">
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-2 col-xs-12 control-label">邮箱</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="email"
						placeholder="请输入邮箱">
				</div>
			</div>
			<div class="form-group">
				<label for="telephone" class="col-sm-2 col-xs-2 control-label">电话</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="telephone"
						placeholder="请输入电话">
				</div>
			</div>
			<div class="form-group">
				<label for="intention" class="col-sm-2 col-xs-2 control-label">意向</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="intention"
						placeholder="请输入意向岗位">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-2 control-label">住址</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="address"
						placeholder="例如：湖北武汉">
				</div>
			</div>
			<div class="form-group ">
				<label for="inputfile" class="col-sm-2 col-xs-12 control-label ">照片输入</label>
				<div class="col-sm-8 col-xs-12">
				<input id="inputfile" name="inputfile" type="file" multiple  class="file"  data-show-upload="false" data-show-caption="true">
				</div>
			</div>
			<button type="button"
				class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
				<span class="glyphicon glyphicon-user"></span>教育背景
			</button>

			<div class="form-group">
				<label for="schoolName" class="col-sm-2 col-xs-2 control-label">学校</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="schoolName"
						placeholder="请输入学校">
				</div>
			</div>
			<div class="form-group">
				<label for="major" class="col-sm-2 col-xs-2 control-label">专业</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="major"
						placeholder="请输入专业">
				</div>
			</div>
			<div class="form-group">
				<label for="graducateTime" class="col-sm-2 col-xs-12 control-label">毕业年</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="graducateTime"
						placeholder="例如：2019届">
				</div>
			</div>
			<div class="form-group">
				<label for="educateType" class="col-sm-2 col-xs-12 control-label">学历</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="educateType"
						placeholder="例如：本科">
				</div>
			</div>
			<div class="form-group ">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-default">在添加一条背景</button>
				</div>
			</div>

			<button type="button"
				class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
				<span class="glyphicon glyphicon-user"></span>项目&实习相关经历
			</button>
			<div class="form-group">
				<label for="startTime" class="control-label col-sm-2 col-xs-2">开始时间</label>
				<div class="date form_date col-sm-8 col-xs-12" data-date=""
					data-date-format="yyyy-mm-dd" data-link-field="dtp_input2"
					data-link-format="yyyy-mm-dd">
					<input size="16" type="text" value="" readonly id="startTime">
					<span class="add-on"><i class="icon-remove"></i></span> <span
						class="add-on"><i class="icon-th"></i></span>
						
				</div>


			</div>
			<div class="form-group">
				<label for="lastTime" class="control-label col-sm-2 col-xs-2">结束时间</label>
				<div class="date form_date col-sm-8 col-xs-12" data-date=""
					data-date-format="yyyy-mm-dd" data-link-field="dtp_input1"
					data-link-format="yyyy-mm-dd">
					<input size="16" type="text" value="" readonly id="lastTime">
					<span class="add-on"><i class="icon-remove"></i></span> <span
						class="add-on"><i class="icon-th"></i></span>
						 <input type="hidden" id="dtp_input1"   /><br/>
				</div>


			</div>
			<div class="form-group">
				<label for="projectName" class="col-sm-2 col-xs-12 control-label">项目名称</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="projectName"
						placeholder="请输入项目名称">
				</div>
			</div>
			<div class="form-group">
				<label for="role" class="col-sm-2 col-xs-12 control-label">职位</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="role" placeholder="职位">
				</div>
			</div>
			<div class="form-group">
				<label for="projectType" class="col-sm-2 col-xs-12 control-label">类型</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="projectType"
						placeholder="请输入项目类型">
				</div>
			</div>
			<div class="form-group">
				<label for="tutor" class="col-sm-2 col-xs-12 control-label">指导人</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="tutor"
						placeholder="请输入指导人">
				</div>
			</div>
			<div class="form-group">
				<label for="content" class="col-sm-2 col-xs-12 control-label">负责内容</label>
				<div class="col-sm-8 col-xs-12">
				<textarea class="form-control" rows="3" id="content"
						placeholder="请输入负责内容"></textarea>
				
				</div>

			</div>
			
			<div class="form-group">
				<label for="projectContent" class="col-sm-2 col-xs-12 control-label">项目内容</label>
				<div class="col-sm-12 col-xs-12">
					<div id="projectContent" class="summernote">项目内容</div>
				</div>
			</div>
			<div class="form-group "></div>
			<button type="button"
				class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
				<span class="glyphicon glyphicon-user"></span> 技能与荣誉
			</button>

			<div class="form-group">
				<label for="killcontent" class="col-sm-2 col-xs-12 control-label">技能与荣誉编辑</label>
				<div class="col-sm-12 col-xs-12">
					<div id="killcontent" class="summernote">技能与荣誉编辑</div>
				</div>
			</div>
			<div class="form-group ">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-default" id="btn">生成</button>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript" src="page/resumepage/editresume.js"></script>
</body>
</html>
