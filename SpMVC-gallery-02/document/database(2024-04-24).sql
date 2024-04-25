-- galleryDB
CREATE DATABASE galleryDB2;
USE galleryDB2;
CREATE TABLE tbl_gallerys(
	g_id	VARCHAR(125)	PRIMARY KEY,
	g_date	VARCHAR(10)	NOT NULL,
	g_time	VARCHAR(10)	NOT NULL,
	g_author	VARCHAR(20)	NOT NULL,
	g_subject	VARCHAR(20)	NOT NULL,
	g_content	VARCHAR(100)	NOT NULL,
	g_origin_image	VARCHAR(225)	NOT NULL,
	g_up_image	VARCHAR(225)	NOT NULL
);
DROP TABLE tbl_gallerys;
DROP TABLE tbl_images;
CREATE TABLE tbl_images(
	i_id	VARCHAR(125)	PRIMARY KEY,
	i_gid	VARCHAR(125)	NOT NULL,
	i_origin_image	VARCHAR(225)	NOT NULL,
	i_up_image	VARCHAR(225)	NOT NULL,
    CONSTRAINT FK_GALLERY
    FOREIGN KEY (i_gid)
    REFERENCES tbl_gallerys(g_id) ON DELETE CASCADE
)