package com.github.e4.core.exception;

/**
 * 应用基础异常类
 * 
 * @author hubin0011@gmail.com
 *
 */
public class AppBaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	
	private String errorMsg;

	public AppBaseException(String errorCode, String errorMsg, Throwable cause) {
		super(errorCode + ":" + errorMsg, cause);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public AppBaseException(String errorMsg, Throwable cause) {
		super( errorMsg, cause);
		this.errorMsg = errorMsg;
	}
	
	public AppBaseException(Throwable cause) {
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
