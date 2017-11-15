package com.shang.service.test;

public class Response<T> {
	private Header header;
	private ResParentBody<T> body;
	private String srcJson;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	
	public ResParentBody<T> getBody() {
		return body;
	}
	public void setBody(ResParentBody<T> body) {
		this.body = body;
	}
	public String getSrcJson() {
		return srcJson;
	}
	public void setSrcJson(String srcJson) {
		this.srcJson = srcJson;
	}
	
	
}
