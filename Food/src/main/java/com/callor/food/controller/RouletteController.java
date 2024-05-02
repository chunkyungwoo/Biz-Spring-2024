package com.callor.food.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.food.models.FoodVO;
import com.callor.food.persistance.FoodDao;

@Controller
public class RouletteController {
	
	private FoodDao foodDao;

	
	public RouletteController(FoodDao foodDao) {
		super();
		this.foodDao = foodDao;
	}

	@RequestMapping(value="/roulette",method=RequestMethod.GET)
	public String showRoulette(Model model) {
		List<FoodVO> foods = foodDao.selectAll();
        model.addAttribute("foods", foods);
        return "roulette";
    }


}
