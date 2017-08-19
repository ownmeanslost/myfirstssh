package com.report.test;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class PrintByType {

	public PrintByType() {
		super();
	
	}
	 public void pdf(JasperPrint jasperPrint,String realPdfPath) throws JRException{
		 JRPdfExporter jrPdfExporter=new JRPdfExporter();
		 //jasperPrint为读取.jasper后生成的需要的打印文件
		 jrPdfExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		 jrPdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(realPdfPath));
		 jrPdfExporter.exportReport();
	 }
}
