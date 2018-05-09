package com.app.core.util.result;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response implements Serializable{

	private static final long serialVersionUID = -3097111454259474090L;
	private String code;
	private String message;
	private Object data;
	
}
