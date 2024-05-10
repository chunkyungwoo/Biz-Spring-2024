package com.callor.hello.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.hello.dao.GalleryDao;
import com.callor.hello.dao.ImageDao;
import com.callor.hello.models.GalleryVO;
import com.callor.hello.models.ImageVO;
import com.callor.hello.service.FileUploadService;
import com.callor.hello.service.GalleryService;

@Service
public class GalleryServiceImpl implements GalleryService{
	
	
	private final FileUploadService fileUploadService;
	private final GalleryDao galleryDao;
	private final ImageDao imageDao;
	public GalleryServiceImpl(FileUploadService fileUploadService, GalleryDao galleryDao, ImageDao imageDao) {
		super();
		this.fileUploadService = fileUploadService;
		this.galleryDao = galleryDao;
		this.imageDao = imageDao;
	}
	
	@Autowired
	public void create_table() {
		galleryDao.create_table(null);
		imageDao.create_table("");
	}


	@Override
	public List<GalleryVO> selectAll() {
		return galleryDao.selectAll();
	}

	@Override
	public GalleryVO createGallery(GalleryVO galleryVO, MultipartFile image_file) throws Exception {
		galleryVO.setG_origin_image(image_file.getOriginalFilename());
		String fileName = fileUploadService.fileUpload(image_file);
		galleryVO.setG_up_image(fileName);
		setGalleryOptions(galleryVO);
		
		int ret = galleryDao.insert(galleryVO);
		if(ret > 0) {
			return galleryVO;
		}
		return null;
	}

	@Override
	public List<GalleryVO> createGallery(GalleryVO galleryVO, MultipartHttpServletRequest image_files)
			throws Exception {
		setGalleryOptions(galleryVO);
		galleryVO.setG_origin_image("");
		galleryVO.setG_up_image("");
		
		int gRet = galleryDao.insert(galleryVO);
		
		String i_gid = galleryVO.getG_id();
		
		List<ImageVO> resultNames = fileUploadService.fileUpload(image_files);
	
		int iRet = imageDao.insert(i_gid, resultNames);
		return null;
	}
	private void setGalleryOptions(GalleryVO vo) {
		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter date = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
		vo.setG_id(UUID.randomUUID().toString());
		vo.setG_date(lt.format(date));
		vo.setG_time(lt.format(time));
	}

}
