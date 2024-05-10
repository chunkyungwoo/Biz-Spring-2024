package com.callor.hello.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.hello.models.GalleryVO;
import com.callor.hello.service.GalleryService;

@Controller
@RequestMapping(value="/gallery")
public class GalleryController {
	private final GalleryService galleryService;
	public GalleryController(GalleryService galleryService) {
		super();
		this.galleryService = galleryService;
	}

	@RequestMapping(value={"/",""},method=RequestMethod.GET)
	public String home(Model model) {
		List<GalleryVO> gList = galleryService.selectAll();
		model.addAttribute("GALLERYS",gList);
		return "gallery/list";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert(Model model) {
		GalleryVO galleryVO = GalleryVO.builder()
				.g_up_image("no_image.png")
				.g_origin_image("no_image.png")
				.build();
		model.addAttribute("GALLERY",galleryVO);
		return "gallery/input";
	}

	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(GalleryVO galleryVO,
			
			@RequestParam("image_file")
			MultipartFile image_file,
			
			MultipartHttpServletRequest image_files,
			Model model) {
		

		String singleFileName = image_file.getOriginalFilename();
		GalleryVO resultVO = null;
		try {
			if(!singleFileName.isEmpty()) {
				galleryVO.setG_up_image(singleFileName);
				resultVO = galleryService.createGallery(galleryVO,image_file);
			}

			if(image_files.getFiles("image_files").size() > 0 ) {
				List<GalleryVO> VOs 
					= galleryService
						.createGallery(galleryVO, image_files);
			}
			model.addAttribute("GALLERY",resultVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("IMAGE",image_file.getOriginalFilename());
		return "gallery/input";
	}

}
