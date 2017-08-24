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

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.myfirsstssh.common.utils.UploadFileUtils;
import com.myfirstssh.resume.vo.ModelPicVO;
import com.myfirstssh.resume.vo.TraditionTemplateVO;

@Controller
@RequestMapping("/resume")
public class ResumeController {

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
	String addUserInfo(TraditionTemplateVO traditionTemplateVO,
			HttpServletRequest request) {
		// 用对象接受前台传过来的值""
		String Guid = UUID.randomUUID().toString();
		// 插入信息

		return Guid;
	}

	// 图片上传
	@RequestMapping(value = "/loadpicture", method = RequestMethod.POST)
	public @ResponseBody
	String loadPicture(String id, MultipartHttpServletRequest request,
			@RequestParam MultipartFile[] inputfile) {
		System.out.println(id);

		String pictureurl = UploadFileUtils.uploadImage(request, inputfile[0]);
		if (pictureurl != null && pictureurl.length() > 0) {
			System.out.println("上传成功！" + pictureurl); //

		} else {
			System.out.println("上传失败！");
		}
		return "0";

	}

	@RequestMapping(value = "/getpdf")
	public void getPdf(HttpServletRequest request, HttpServletResponse response) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		InputStream in = null;

		// String realFilePath =
		// request.getSession().getServletContext().getRealPath(File.separator
		// );

		try {

			// jasper路径

			in = new FileInputStream(new File(""));

			ServletOutputStream servletOutputStream = null;
			servletOutputStream = response.getOutputStream();
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
