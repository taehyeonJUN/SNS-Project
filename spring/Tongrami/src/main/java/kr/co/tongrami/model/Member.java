package kr.co.tongrami.model;

import java.util.Date;

public class Member {
	
	String memId;
	String memPass;
	String memName;
	String memTel;
	Date memRegDate;
	String memAuthor;
	String memThemeColor;
	String memPhotoAddr;
	String memIntro;
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemTel() {
		return memTel;
	}
	public void setMemTel(String memTel) {
		this.memTel = memTel;
	}
	public Date getMemRegDate() {
		return memRegDate;
	}
	public void setMemRegDate(Date memRegDate) {
		this.memRegDate = memRegDate;
	}
	public String getMemAuthor() {
		return memAuthor;
	}
	public void setMemAuthor(String memAuthor) {
		this.memAuthor = memAuthor;
	}
	public String getMemThemeColor() {
		return memThemeColor;
	}
	public void setMemThemeColor(String memThemeColor) {
		this.memThemeColor = memThemeColor;
	}
	public String getMemPhotoAddr() {
		return memPhotoAddr;
	}
	public void setMemPhotoAddr(String memPhotoAddr) {
		this.memPhotoAddr = memPhotoAddr;
	}
	public String getMemIntro() {
		return memIntro;
	}
	public void setMemIntro(String memIntro) {
		this.memIntro = memIntro;
	}
	
}