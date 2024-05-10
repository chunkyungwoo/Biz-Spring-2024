-- galleryDB3

CREATE DATABASE galleryDB3;

USE galleryDB3;

CREATE TABLE tbl_users(
	username	VARCHAR(125)	PRIMARY KEY,
	password	VARCHAR(125)	NOT NULL,
	email	VARCHAR(125)	NOT NULL,
	tel	VARCHAR(125)	NOT NULL
);

DROP TABLE tbl_gallerys;

CREATE TABLE tbl_gallerys(
	g_id	VARCHAR(125)	PRIMARY KEY,
	g_date	VARCHAR(10)	NOT NULL,
	g_time	VARCHAR(10)	NOT NULL,
	g_author	VARCHAR(20)	NOT NULL,
	g_subject	VARCHAR(20)	NOT NULL,
	g_content	VARCHAR(100)	NOT NULL,
    g_origin_image	VARCHAR(255)	NOT NULL,
	g_up_image	VARCHAR(255)	NOT NULL
);

CREATE TABLE tbl_images(
	i_id	VARCHAR(125)	PRIMARY KEY,
	i_gid	VARCHAR(125)	NOT NULL,
	i_origin_image	VARCHAR(255)	NOT NULL,
	i_up_image	VARCHAR(255)	NOT NULL
);

SELECT * FROM tbl_gallerys;

SELECT * FROM tbl_images;