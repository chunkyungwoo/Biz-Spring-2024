-- galleryDB2;

USE galleryDB2;

DROP TABLE tbl_mygallery;
CREATE TABLE tbl_mygallery(
private String g_id;
	g_date VARCHAR(125) PRIMARY KEY,
	g_time VARCHAR(10),
	g_subject VARCHAR(10),
	 g_content VARCHAR(400),
	 g_writer VARCHAR(125),
	g_password VARCHAR(125),
	g_image VARCHAR(255)
);