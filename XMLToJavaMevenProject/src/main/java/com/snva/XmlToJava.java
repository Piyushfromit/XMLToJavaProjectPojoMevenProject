package com.snva;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class XmlToJava {
	
	
	public static void main(String[] args) {
		
		try {
			File file = new File("src/main/resources/ErrorInfo.xml");
			
			JAXBContext jaxbContext= JAXBContext.newInstance(ErrorInfo.class);
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			
			ErrorInfo errorInfo = (ErrorInfo) unmarshaller.unmarshal(file);
			
			System.out.println(errorInfo.getCode());
			System.out.println(errorInfo.getService());
			System.out.println(errorInfo.getType());
			System.out.println(errorInfo.getDescription());
			System.out.println(errorInfo.getTransactionId());
			System.out.println(errorInfo.getTraceId());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
		
		
		
		
	}

}
