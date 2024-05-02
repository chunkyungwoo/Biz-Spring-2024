package com.callor.food.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/random")
public class FoodController {
	
	private static final List<String> FOOD_LIST = Arrays.asList(
            "Pizza", "Burger", "Sushi", "Pasta", "Salad",
            "Taco", "Sandwich", "Steak", "Ramen", "Fried Chicken"
    );

	
//	@Autowired
//	private FoodDao foodDao;
	
	@RequestMapping(value={"/",""},method=RequestMethod.GET)
	public String random(Model model) {
		Random random = new Random();
		int randomIndex = random.nextInt(FOOD_LIST.size());
		String randomFood = FOOD_LIST.get(randomIndex);
		model.addAttribute("food",randomFood);
		return "food/random";
	}
	

}
