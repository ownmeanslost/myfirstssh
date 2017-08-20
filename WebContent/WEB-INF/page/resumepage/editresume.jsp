<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<jsp:include page="/WEB-INF/scripts/common/common.jsp"></jsp:include>


</head>

<body>

	<h1 class="container">请填写简历上信息</h1>
	<br />


	<div class="container">
		<form class="form-horizontal" role="form">
			<button type="button"
				class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
				<span class="glyphicon glyphicon-user"></span> 个人信息
			</button>
			<div class="form-group">
				<label for="name" class="col-sm-2 col-xs-12 control-label">姓名</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="firstname"
						placeholder="请输入名字">
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-2 col-xs-12 control-label">邮箱</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入邮箱">
				</div>
			</div>
			<div class="form-group">
				<label for="telephone" class="col-sm-2 col-xs-2 control-label">电话</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入电话">
				</div>
			</div>
			<div class="form-group">
				<label for="intention" class="col-sm-2 col-xs-2 control-label">意向</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入意向岗位">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-2 control-label">住址</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="例如：湖北武汉">
				</div>
			</div>
			<div class="form-group ">
				<label for="inputfile" class="col-sm-2 col-xs-12 control-label ">照片输入</label>
				<input type="file" id="inputfile" class="col-sm-8 col-xs-12">
				<p class="help-block col-sm-4 col-xs-4">请上传一寸照片。</p>
			</div>
			<button type="button"
				class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
				<span class="glyphicon glyphicon-user"></span>教育背景
			</button>

			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-2 control-label">学校</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入学校">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-2 control-label">专业</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入专业">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">毕业年</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入毕业年">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">学历</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
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
				<label class="control-label col-sm-2 col-xs-2">开始时间</label>
				<div class="date form_date col-sm-8 col-xs-12" data-date=""
					data-date-format="dd MM yyyy" data-link-field="dtp_input2"
					data-link-format="yyyy-mm-dd">
					<input size="16" type="text" value="" readonly> <span
						class="add-on"><i class="icon-remove"></i></span> <span
						class="add-on"><i class="icon-th"></i></span>
				</div>
				<input type="hidden" id="dtp_input2" value="" /><br />

			</div>
			<div class="form-group">
				<label class="control-label col-sm-2 col-xs-2">结束时间</label>
				<div class="date form_date col-sm-8 col-xs-12" data-date=""
					data-date-format="dd MM yyyy" data-link-field="dtp_input2"
					data-link-format="yyyy-mm-dd">
					<input size="16" type="text" value="" readonly> <span
						class="add-on"><i class="icon-remove"></i></span> <span
						class="add-on"><i class="icon-th"></i></span>
				</div>
				<input type="hidden" id="dtp_input2" value="" /><br />

			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">项目名称</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入项目名称">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">职位</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="职位">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">类型</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入项目类型">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">指导人</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入指导人">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">负责内容</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入负责内容">
				</div>

			</div>
			<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">项目内容</label>
				<div class="col-sm-8 col-xs-12">
					<input type="text" class="form-control" id="lastname"
						placeholder="请输入项目内容">
				</div>
			</div>
				<div class="form-group "></div>
				<button type="button"
					class="btn btn-default btn-sm col-sm-12 col-xs-12 ">
					<span class="glyphicon glyphicon-user"></span> 技能与荣誉
				</button>
			
				<div class="form-group">
				<label for="address" class="col-sm-2 col-xs-12 control-label">技能与荣誉编辑</label>
				<div class="col-sm-12 col-xs-12">
				<div id="summernote">技能与荣誉编辑</div>	
				</div>
			</div>
				<div class="form-group ">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">生成</button>
					</div>
				</div>
		</form>
	</div>
	<script type="text/javascript"
		src="scripts/bootstrap/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript"
		src="scripts/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
			<script type="text/javascript"
		src="scripts/bootstrap/js/summernote.min.js"></script>
		<script type="text/javascript"
		src="scripts/bootstrap/js/summernote-zh-CN.js"></script>
	<script type="text/javascript">
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$(document).ready(function() {
        $('#summernote').summernote({
        lang: 'zh-CN',
         height: 300,                 // set editor height
  		minHeight: null,             // set minimum height of editor
  		maxHeight: null,             // set maximum height of editor
 		 focus: true ,
 		  toolbar:[
            ['style',['bold','italic','underline','clear']],
            ['fontsize',['fontsize']],
            ['para',['ul','ol','paragraph']],
            ['color',['color']]
        ]  
        });
    });
		
	</script>
</body>
</html>
