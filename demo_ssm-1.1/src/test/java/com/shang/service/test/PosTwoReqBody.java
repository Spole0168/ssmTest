package com.shang.service.test;

public class PosTwoReqBody extends ReqParentBody{
	public String cardNo;
	public String city;
	public String province;
	public String contactsMobile;
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getContactsMobile() {
		return contactsMobile;
	}
	public void setContactsMobile(String contactsMobile) {
		this.contactsMobile = contactsMobile;
	}
	
}
