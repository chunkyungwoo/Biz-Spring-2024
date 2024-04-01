package com.callor.iolist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.callor.iolist.models.IolistVO;
import com.callor.iolist.persistance.IolistDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/iolist")
public class IolistController {
	
	private final IolistDao iolistDao;
	public IolistController(IolistDao iolistDao) {
		// TODO Auto-generated constructor stub
		this.iolistDao = iolistDao;
	}
	
	@RequestMapping(value={"/",""},method=RequestMethod.GET)
	public String home(Model model) {
		List<IolistVO> ioList = iolistDao.selectAll();
		model.addAttribute("IO_LIST",ioList);
		return "iolist/list";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert() {
		return "iolist/input";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(IolistVO vo, Model model) {
		try {
			int result = iolistDao.insert(vo);
			if(result > 0) {
				return "/redirect/:iolist";
			}else {
				model.addAttribute("MSG","ERROR");
				return "iolist/input";
			}
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("MSG","SQL ERROR");
			return "iolist/input";
		}
	}
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String detail(@RequestParam("seq") String seq,Model model,
			@RequestParam(name="msg",required = false,defaultValue="OK")String msg) {
		IolistVO iolistVO = iolistDao.findById(seq);
		model.addAttribute("IO",iolistVO);
		model.addAttribute("MSG",msg);
		
		return "iolist/detail";
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(@RequestParam("seq")String seq,Model model) {
		IolistVO iolistVO = iolistDao.findById(seq);
		model.addAttribute("IO",iolistVO);
		return "iolist/input";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(IolistVO iolistVO) {
		log.debug("update {} ",iolistVO.toString());
		int result = iolistDao.update(iolistVO);
		
		return "redirect:/iolist/detail?seq=" + iolistVO.getSeq();
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@PathVariable("seq")String seq) {
		int result = 0;
		try {
			result = iolistDao.delete(seq);
		} catch (Exception e) {
			// TODO: handle exception
			return "redirect:/iolist/detail?seq=" + seq + "&msg=FK";
		}
		if(result > 0) {
			return "redirect:/iolist";
		}else {
			return "redirect:/iolist/detail?seq=" + seq + "&msg=NOT";
		}
	}

}




