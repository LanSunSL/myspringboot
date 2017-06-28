package org.error.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error";

	// @ExceptionHandler(Exception.class)
	// public ModelAndView defaultErrorHandler(HttpServletRequest request,
	// Exception e) {
	// ModelAndView mav = new ModelAndView(DEFAULT_ERROR_VIEW);
	// mav.addObject("url", request.getRequestURL());
	// mav.addObject("exception", e);
	// return mav ;
	// }
	@ExceptionHandler(Exception.class)
	public Object defaultErrorHandler(HttpServletRequest request, Exception e) {
		class ErrorInfo {
			private Integer code;
			private String message;
			private String url;

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
		ErrorInfo info = new ErrorInfo();
		info.setCode(100);
		info.setMessage(e.getMessage());
		info.setUrl(request.getRequestURL().toString());
		return info;
	}
}
