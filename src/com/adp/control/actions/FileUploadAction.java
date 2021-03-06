package com.adp.control.actions;


import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import com.adp.utils.FilesUtil;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletContextAware{

	private static final long serialVersionUID = -4748500436762141116L;

	public String upload(){
		
		return SUCCESS ;
	}
	public String doUpload(){
		System.out.println("File Name is:"+getFileFileName());
		System.out.println("File ContentType is:"+getFileContentType());
		System.out.println("Files Directory is:"+filesPath);
		try {
			FilesUtil.saveFile(getFile(), getFileFileName(), ServletActionContext.getServletContext().getRealPath("") + File.separator + filesPath);
		} catch (IOException e) {
			e.printStackTrace();
			return INPUT;
		}
		return SUCCESS;
		
	}
	
	private File file;
	private String fileContentType;
	private String fileFileName;
	private String filesPath;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
	
	


