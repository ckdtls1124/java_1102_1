package org1.study.Dto;

public class Dto {
	
	private int bId;
	private String writeId;
	private String bContent;
	
	public Dto(int bId, String writeId, String bContent) {
		super();
		this.bId = bId;
		this.writeId = writeId;
		this.bContent = bContent;
	}

	public int getbId() {
		return bId;
	}

	public String getWriteId() {
		return writeId;
	}

	public String getbContent() {
		return bContent;
	}
	
	
	
	
	
}
