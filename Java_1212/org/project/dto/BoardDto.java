package org.project.dto;

import java.util.Date;

public class BoardDto {

	private int no;
	private String bTitle;
	private String bContent;
	private String alias;
	private Date date;
	private String writer; // FK references userid in memberDto
	
	public BoardDto(int no, String bTitle, String bContent, String alias, Date date, String writer) {
		super();
		this.no = no;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.alias = alias;
		this.date = date;
		this.writer = writer;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
