
/* Drop Tables */

DROP TABLE Board1212 CASCADE CONSTRAINTS;
DROP TABLE member1212 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board1212
(
	no number NOT NULL,
	bContent varchar2(100 char) NOT NULL,
	bTitle varchar2(100 char) NOT NULL,
	Nickname varchar2(100 char) NOT NULL,
	date date NOT NULL,
	writer varchar2(20 char) NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE member1212
(
	userid varchar2(20 char) NOT NULL,
	userpw varchar2(20 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userid)
);



/* Create Foreign Keys */

ALTER TABLE Board1212
	ADD FOREIGN KEY (writer)
	REFERENCES member1212 (userid)
;



