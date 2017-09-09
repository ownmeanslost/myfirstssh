package com.myfirstssh.common.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.myfirstssh.resume.model.UserInfo;
import com.myfirstssh.resume.service.UserInfoService;



public class UploadFileUtils {
	/**
     * 将上传的图片保存到本地f盘的工具类。
     *  原名称
     * @param request 请求
     * @param file 文件
     * @param
     * @return 完整文件路径
     */
    public static String uploadImage(MultipartHttpServletRequest request, MultipartFile file,String id) {
    	
    	String rootUrl=request.getSession().getServletContext().getRealPath(File.separator+"WEB-INF"+File.separator+"file"+File.separator+"userpictury"+File.separator);
    	//String rootUrl="F"+"://"+"plantpictureurl/";//根目录，
        //上传
        try {
            if(file!=null){
                String origName=file.getOriginalFilename();// 文件原名称
                //文件新名
         
                String newName=id+"."+origName.split("\\.")[origName.split("\\.").length-1];
                
                System.out.println("上传的文件新名称:"+newName);
                        //存放图片文件的路径
                        String fileSrc="";
                        try{
                        	//一种方法
                        	File uploadedFile = new File(rootUrl,newName);
                        	System.out.println(uploadedFile.getPath());
                        	File fileParent = uploadedFile.getParentFile();  
                        	if(!fileParent.exists()){
                        		fileParent.mkdir();
                        	}
                        	file.transferTo(uploadedFile);
                        	
                        	//第二种方法
                      /*      File uploadedFile = new File(rootUrl+"//"+origName);
                            System.out.println("upload==="+rootUrl);
                            OutputStream os = new FileOutputStream(uploadedFile);
                            InputStream is =file.getInputStream();
                            byte buf[] = new byte[1024];//可以修改 1024 以提高读取速度
                            int length = 0;
                            while( (length = is.read(buf)) > 0 ){
                                os.write(buf, 0, length);
                            }
                            //关闭流
                            os.flush();
                            is.close();
                            os.close();*/
                        	
                            fileSrc=rootUrl+File.separator+newName;
                            System.out.println("保存成功！路径："+rootUrl+"/"+newName);
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        return fileSrc;
                    }
            return null;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

