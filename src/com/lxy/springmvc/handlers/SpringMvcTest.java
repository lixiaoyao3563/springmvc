package com.lxy.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/springmvc")
@Controller
public class SpringMvcTest {
	
	private static final String SUCCESS = "success";
	
	@RequestMapping(value="/testParamsAndHeaders", method=RequestMethod.POST, headers= {"Accept-Language=zh-CN,zh;q=0.8"})
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}
	
	@RequestMapping("/testAntPath/*/test")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id ) {
		System.out.println("testPathVariable:"+id);
		return SUCCESS;
	}
	
	
	
	
	@RequestMapping(value="/testRest", method=RequestMethod.POST)
	public String testRestPOST() {
		System.out.println("POST");
		return SUCCESS;
	}

	@RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
	public String testRestGET(@PathVariable("id") Integer id) {
		System.out.println("GET:"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.PUT)
	public String testRestPUT(@PathVariable("id") Integer id) {
		System.out.println("PUT:"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
	public String testRestDELETE(@PathVariable("id") Integer id) {
		System.out.println("DELETE:"+id);
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String username,
			@RequestParam(value="password", required=false, defaultValue="000000") String password) {
		System.out.println("testRequestParam:username="+username+"  password:"+password);
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept-Language") String acceptLanguage,
			@RequestHeader(value="Host") String host) {
		System.err.println("testRequestHeader: Accept-Language="+acceptLanguage+"  Host="+host);
		return SUCCESS;
	}
	
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue(value="JSESSIONID") String jsessionid) {
		System.out.println("testCookieValue:"+jsessionid);
		return SUCCESS;
	}
	
	
	
	
	
	
	
}
