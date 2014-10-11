package com.git.e4.core.exception;

/**
 * 平台基础异常类
 * 
 * @author hubin0011@gmail.com
 *
 */
public class PlatformBaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private String errorCode;
	
	private String errorMsg;

	public PlatformBaseException(String errorCode, String errorMsg, Throwable cause) {
		super(errorCode + ":" + errorMsg, cause);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public PlatformBaseException(String errorMsg, Throwable cause) {
		super( errorMsg, cause);
		this.errorMsg = errorMsg;
	}
	
	public PlatformBaseException(Throwable cause) {
		super(cause);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
