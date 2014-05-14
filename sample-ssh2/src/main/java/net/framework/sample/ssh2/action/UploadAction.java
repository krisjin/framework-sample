package net.framework.sample.ssh2.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * TODO 此处填写 class 信息
 * 
 * @author krisjin (mailto:krisjin86@163.com)
 */
@Scope("prototype")
@Controller("upload")
public class UploadAction extends ActionSupport {

	private List<File> file;

	private List<String> fileFileName;

	private List<String> fileContentType;

	private List<String> newImgPath = new ArrayList<String>();

	@SuppressWarnings("deprecation")
	public String upload() {
		for (int i = 0; i < file.size(); i++) {
			String root = ServletActionContext.getRequest().getRealPath("/upload");

			int idx = fileFileName.get(i).lastIndexOf(".");
			String extention = fileFileName.get(i).substring(idx);
			String time = String.valueOf(System.currentTimeMillis());
			String newPath = time + extention;

			newImgPath.add(newPath);

			File destFile = new File(root, newPath);

			try {
				FileUtils.copyFile(file.get(i), destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "up";
	}
	
	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public List<String> getNewImgPath() {
		return newImgPath;
	}

	public void setNewImgPath(List<String> newImgPath) {
		this.newImgPath = newImgPath;
	}

}
