package com.snva;
import jakarta.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class ErrorInfo {
	
	private String Code;
	
	private String Service;

	private String Type;

	private String Description;

	private String TransactionId;

	private String TraceId;
	
	
	

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getService() {
		return Service;
	}

	public void setService(String service) {
		Service = service;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}

	public String getTraceId() {
		return TraceId;
	}

	public void setTraceId(String traceId) {
		TraceId = traceId;
	}

	
	
	
	
	

}
