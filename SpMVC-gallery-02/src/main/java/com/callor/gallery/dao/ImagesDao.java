package com.callor.gallery.dao;

import com.callor.gallery.models.ImageVO;

public interface ImagesDao extends GenericDao<ImageVO, String>{

	void create_table(String string);

}
