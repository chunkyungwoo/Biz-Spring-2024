package com.callor.hello.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.callor.hello.models.ImageVO;

public interface ImageDao extends GenericDao<ImageVO, String>{
	
	public int insert(
			@Param("g_id") String i_gid,
			@Param("images") List<ImageVO> resultNames
			);

}
