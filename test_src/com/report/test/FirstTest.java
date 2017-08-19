package com.report.test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class FirstTest extends PrintByType{

	public static void main(String[] args) throws JRException {
		FirstTest factory =new FirstTest();
		factory.test();
		
	}
	public void test() throws JRException {
		//参数
		Map<String,Object> parameters = new HashMap<String,Object>();
		this.fillDataSource(parameters);
		parameters.put("title", "测试");
		parameters.put("SUBREPORT_DIR", "D:\\VRV\\ireportdemo\\Test\\");
		//加载二进制的jasper
		JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile("D:\\VRV\\ireportdemo\\Test\\123qwert.jasper");
		//将加载好的文件生成需要打印的print文件，此文件为二进制
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
		//形成唯一的guid码
		String guid = UUID.randomUUID().toString();
		System.out.println(guid);
		//src指明生成的pdf在哪个路径
		String src = "D:\\VRV\\ireportdemo\\Test\\" + guid + ".pdf";
		//生成pdf
		this.pdf(jasperPrint, src);
		System.out.println(src);
		}
	
	public void fillDataSource(Map<String,Object> parameters){
		
		
	}
}
