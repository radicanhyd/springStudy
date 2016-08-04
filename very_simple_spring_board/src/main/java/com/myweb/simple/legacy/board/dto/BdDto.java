package com.myweb.simple.legacy.board.dto;

import java.sql.Timestamp;

public class BdDto {
	
	int sid ;
	String bName ;
	String bContent ;
	String bTitle ;
	Timestamp bDate	;
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	
	
	@Override
	public String toString() {
		return "BdDto [sid=" + sid + ", bName=" + bName + ", bContent=" + bContent + ", bTitle=" + bTitle + ", bDate="
				+ bDate + "]";
	}
	

}
