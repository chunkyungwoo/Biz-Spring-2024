package com.callor.food.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.food.models.FoodVO;

public interface FoodDao {
	
	@Select("SELECT * FROM tbl_food")
	public List<FoodVO> selectAll();
	


}