package com.snva;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name = "ErrorInfo")
public class ErrorInfo {
	
	@XmlElement(name="Code")
	private String Code;
	
	@XmlElement(name="Service")
	private String Service;

	@XmlElement(name="Type")
	private String Type;

	@XmlElement(name="Description")
	private String Description;

	@XmlElement(name="TransactionId")
	private String TransactionId;

	@XmlElement(name="TraceId")
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

	@Override
	public String toString() {
		return "ErrorInfo [Code=" + Code + ", Service=" + Service + ", Type=" + Type + ", Description=" + Description
				+ ", TransactionId=" + TransactionId + ", TraceId=" + TraceId + "]";
	}

	
	
	
	
	

}
