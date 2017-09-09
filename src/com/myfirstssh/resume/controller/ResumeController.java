package com.myfirstssh.resume.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.myfirstssh.common.service.BaseDataSourceFactory;
import com.myfirstssh.common.service.impl.JavaBeanDataSourceFactory;
import com.myfirstssh.common.utils.UploadFileUtils;
import com.myfirstssh.resume.model.Educate;
import com.myfirstssh.resume.model.Kill;
import com.myfirstssh.resume.model.ProjectExp;
import com.myfirstssh.resume.model.ResumeInfo;
import com.myfirstssh.resume.model.UserInfo;
import com.myfirstssh.resume.service.EducateService;
import com.myfirstssh.resume.service.KillService;
import com.myfirstssh.resume.service.ProjectExpService;
import com.myfirstssh.resume.service.ResumeInfoService;
import com.myfirstssh.resume.service.UserInfoService;
import com.myfirstssh.resume.vo.ModelPicVO;
import com.myfirstssh.resume.vo.TraditionTemplateVO;

@Controller
@RequestMapping("/resume")
public class ResumeController {
	@Autowired
	UserInfoService userInfoService;
	@Autowired
	KillService killService;
	@Autowired
	EducateService educateService;
	@Autowired
	ProjectExpService projectExpService;
	@Autowired
	ResumeInfoService resumeInfoService;
	
	@RequestMapping("/gotoaddresume")
	public String goToAddResume() {

		return "/resumepage/addresume";
	}

	@RequestMapping("/gotoeditresume")
	public String goToEditResume() {

		return "resumepage/editresume";
	}

	@RequestMapping("/gotocreateresume")
	public String goToCreateResume() {
		return "resumepage/createresume";
	}

	// 添加个人信息，图片除外
	@RequestMapping(value = "/adduserinfo", method = RequestMethod.POST)
	public @ResponseBody
	String addUserInfo(UserInfo userinfo,Educate educate,ProjectExp projectExp,Kill kill,
			HttpServletRequest request) {
		// 用对象接受前台传过来的值""
		String Guid = UUID.randomUUID().toString();
		userinfo.setGuid(Guid);
		educate.setUserGuid(Guid);
		kill.setUserGuid(Guid);
		projectExp.setUserGuid(Guid);
		userInfoService.save(userinfo);
		educateService.save(educate);
		projectExpService.save(projectExp);
		killService.save(kill);
		// 插入信息
		return Guid;
	}

	// 图片上传
	@RequestMapping(value = "/loadpicture", method = RequestMethod.POST)
	public @ResponseBody
	String loadPicture(String id, MultipartHttpServletRequest request,
			@RequestParam MultipartFile[] inputfile) {
		System.out.println(id);
		String pictureurl = UploadFileUtils.uploadImage(request, inputfile[0],id);
		if (pictureurl != null && pictureurl.length() > 0) {
			UserInfo userInfo=userInfoService.get(id);
			userInfo.setImgurl(pictureurl);
			userInfoService.update(userInfo);
			System.out.println("上传成功！" + pictureurl); //

		} else {
			System.out.println("上传失败！");
		}
		return "0";

	}

	@RequestMapping(value = "/getpdf" ,method = RequestMethod.POST)
	public void getPdf(HttpServletRequest request, HttpServletResponse response) {
		String userGuid=request.getParameter("fishId");
		String id=request.getParameter("id");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("userGuid",userGuid);
		InputStream in = null;
		//获得模板jasper文件路径
		ResumeInfo resumeInfo=resumeInfoService.get(id);
		String filePath=resumeInfo.getFilepath().replace("/", File.separator);
		String jasperUrl=filePath+File.separator+resumeInfo.getFilename();
		//完整路径
		String rootUrl=request.getSession().getServletContext().getRealPath(File.separator+"WEB-INF"+File.separator+"file"+File.separator+"jasperfile"+"\\");
		System.out.println(rootUrl);
		parameters.put("SUBREPORT_DIR",rootUrl);
		String jaspeRootUrl=rootUrl+ File.separator+jasperUrl;
		try {

			// jasper路径

			in = new FileInputStream(new File(jaspeRootUrl));
			ServletOutputStream servletOutputStream = null;
			servletOutputStream = response.getOutputStream();
			
			BaseDataSourceFactory baseDataSourceFactory=JavaBeanDataSourceFactory.getBaseDataSourceFactory(resumeInfo.getBeanjson(), parameters);
			baseDataSourceFactory.getDefineAllDateSource();
			//parameters.putAll(m);
			JasperRunManager.runReportToPdfStream(in, servletOutputStream,
					parameters, new JREmptyDataSource());
		} catch (FileNotFoundException e) {
			System.out.println("jasper文件未找到");

		} catch (IOException e) {

			e.printStackTrace();
		} catch (JRException e) {
			System.out.println("JasperRunManager.runReportToPdfStream error");

		}

	}

	// 请求图片
	@RequestMapping("/getmodelpic")
	public @ResponseBody
	List<ModelPicVO> getModelPic() {

		return null;

	}
}
