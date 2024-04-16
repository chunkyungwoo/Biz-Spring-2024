-- userDB;
USE userDB;
CREATE TABLE IF NOT EXISTS tbl_users(
 			username VARCHAR(30) PRIMARY KEY,
 			password VARCHAR(64) NOT NULL,
 			email VARCHAR(50)
 		);
CREATE TABLE IF NOT EXISTS tbl_roles(
 			r_username VARCHAR(30) NOT NULL,
 			r_role VARCHAR(20) NOT NULL,
 			FOREIGN KEY (r_username)
 			REFERENCES tbl_users(username) ON DELETE CASCADE
 		);
        
SHOW TABLES;

DROP TABLE tbl_roles;
DROP TABLE tbl_users;

SELECT * FROM tbl_roles;
SELECT * FROM tbl_users;


SELECT * FROM tbl_users U
	JOIN tbl_roles R
		ON U.username = R.r_username;
        
DELETE FROM tbl_users WHERE username = 'woowo';
DELETE FROM tbl_users WHERE username = 'callor';
SELECT LENGTH(password) FROM tbl_users;