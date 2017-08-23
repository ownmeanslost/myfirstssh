package com.myfirstssh.resume.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

//import com.myfirsstssh.common.utils.UploadFileUtils;

@Controller
@RequestMapping("/resume")
public class ResumeController {

	@RequestMapping("/gotoaddresume")
	public String goToAddResume(){
		
		return  "/resumepage/addresume";
	}
	@RequestMapping("/gotoeditresume")
	public String goToEditResume(){
		
		return "resumepage/editresume";
	}
	
	@RequestMapping("/gotocreateresume")
	public String goToCreateResume(){
		return "resumepage/createresume";
	}
	@RequestMapping(value="/adduserinfo", method=RequestMethod.POST)
	public @ResponseBody Integer addUserInfo(HttpServletRequest request){
		String name=request.getParameter("name");
		//System.out.println(name);
		return 0;
	}
	
	//图片上传
	@RequestMapping(value="/loadpicture",method=RequestMethod.POST)
	public @ResponseBody String loadPicture(Integer id, MultipartHttpServletRequest request, @RequestParam MultipartFile[] inputfile){
		
		 String pictureurl =""; 
		 //pictureurl=pictureurl+UploadFileUtils.uploadImage(request,inputfile[0]);
		 if(pictureurl!=null&&pictureurl.length()>0){
             System.out.println("上传成功！"+pictureurl); //
           
         }else {
             System.out.println("上传失败！");
         }
		return "0";
		
	}
	
}
