package com.app.core.util.result;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response implements Serializable{

	private static final long serialVersionUID = -3097111454259474090L;
	private String code;
	private String message;
	private Object data;
	
	public Response() {
		super();
	}

	public Response(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public Response(String code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

}
