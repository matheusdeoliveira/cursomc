package com.cursomc.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msgExp) {
		super(msgExp);
	}
	
	public ObjectNotFoundException(String msgExp, Throwable cause) {
		super(msgExp, cause);
	}
}
