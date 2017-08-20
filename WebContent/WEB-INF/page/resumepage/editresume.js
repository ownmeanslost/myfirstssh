(function($){
	var events={};
	events.init = function() {
		//初始化日历插件
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
		//初始化编辑插件
		$('.summernote').summernote({
			lang : 'zh-CN',
			height : 300, // set editor
			// height
			minHeight : null, // set minimum height of editor
			maxHeight : null, // set maximum height of editor
			focus : true,
			toolbar:[
			            ['style',['bold','italic','underline','clear']],
			            ['fontsize',['fontsize']],
			            ['para',['ul','ol','paragraph']],
			            ['color',['color']]
			        ]
			});
		//初始化图片上传插件
		events.fishFileInput("inputfile","/resume/loadpicture");
	};
	
	events.fishFileInput=function(ctrlName, uploadUrl){
		$("#inputfile").fileinput({
            language: 'zh', //设置语言
            uploadUrl:contextPath +'/resume/loadpicture', //上传的
            allowedFileExtensions: ['jpg', 'gif', 'png'],//接收的文件后缀
            uploadExtraData:{"id": 1, "fileName":'123.mp3'},
            uploadAsync: false, //默认异步上传
            showUpload: false, //是否显示上传按钮
            showRemove : true, //显示移除按钮
            showPreview : true, //是否显示预览
            showCaption: false,//是否显示标题
            browseClass: "btn btn-primary", //按钮样式     
            dropZoneEnabled: false,//是否显示拖拽区域
            //minImageWidth: 50, //图片的最小宽度
            //minImageHeight: 50,//图片的最小高度
            //maxImageWidth: 1000,//图片的最大宽度
            //maxImageHeight: 1000,//图片的最大高度
            //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
            //minFileCount: 0,
            maxFileCount: 1, //表示允许同时上传的最大文件个数
            enctype: 'multipart/form-data',
            validateInitialCount:true,
            previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
            msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
            layoutTemplates:{
            	actionDelete:'',
            	actionUpload:'',
            	actionZoom:''
            },
		uploadExtraData:function (previewId, index) {
            //向后台传递id作为额外参数，是后台可以根据id修改对应的图片地址。
            var obj = {};
            obj.id = fishId;
            return obj;
        }
        }).on("filebatchuploadsuccess", function (event, data) {
        	
            var res = data.response;
            if (res) {
                alert('上传成功');
            }
            else {
                alert('上传失败')
            }
        });
	}
	//先提交个人信息，再提交图片
	$("#btn").click(function(){
		
		 var email= $("#email").val();
		 var telephone= $("#telephone").val();
		 var intention= $("#intention").val();
		 var address= $("#address").val();
		 var picturename="";
		 picturename=$("#inputfile").val().substring($("#inputfile").val().indexOf('.'),$("#inputfile").val().length).toUpperCase();
		 if (picturename ==".JPG"  || picturename ==".PNG" || picturename =="" || picturename==".BMP"|| picturename==".JPEG") {
		        $.ajax({
		            type: 'post',
		            url: contextPath + '/resume/adduserinfo',
		            data: {
		            	name:$("#inputfile").val(),
		            },
		            success: function (data) {
		                fishId = data;
	
		                //不上传图片时，不触发bootstrap 上传插件的初始化方法。仅将表单里面的（除图片以外的）内容提交，
		                if ($("#inputfile").val() != "") {
		                    $('#inputfile').fileinput('upload'); //触发插件开始上传。
		                }
		            }
		        });
		    }else {
		        alert("只能上传.jpg，.png，.PNG,.JPG,bmp,jpeg格式的图片");
		        return false;
		    }
		
		 
		 
		});
	
	
	$(events.init);
})(jQuery);