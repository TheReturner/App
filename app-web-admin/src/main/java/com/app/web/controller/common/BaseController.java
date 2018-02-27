package com.app.web.controller.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.app.core.util.result.Response;

public class BaseController {

	protected Logger log = LoggerFactory.getLogger(this.getClass()); 

	public static Response success(String code, String message, Object data){
		return Response.builder().code(code).message(message).data(data).build();
	}

	public static Response error(String code, String message, Object data){
		return Response.builder().code(code).message(message).data(data).build();
	}
}
