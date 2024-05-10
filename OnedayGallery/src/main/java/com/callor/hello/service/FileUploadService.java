package com.callor.hello.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.hello.models.ImageVO;

public interface FileUploadService {
	
	/**
	 * @param file
	 * @return
	 */
	
	public String fileUpload(MultipartFile file) throws Exception;
	
	public List<ImageVO> fileUpload(MultipartHttpServletRequest files) throws Exception;

}
