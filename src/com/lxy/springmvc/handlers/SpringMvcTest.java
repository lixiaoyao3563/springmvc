package com.lxy.springmvc.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lxy.springmvc.entities.User;


//@SessionAttributes(value= {"user"}, types=String.class)
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
	
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo  "+user);
		return SUCCESS;
	}
	
	@RequestMapping("/testServletAPI")
	public String testServletAPI(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("testServletAPI "+request +"   "+response);
		return SUCCESS;
	}
	
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		String viewName = SUCCESS;
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("time", new Date());
		return modelAndView;
	}
	
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> map) {
		map.put("names", Arrays.asList("Tom","John","Bruce"));
		return SUCCESS;
	}
	
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String,Object> map) {
		map.put("user", new User("zhangsan", "123456", "zhangsan@qq.com", 12));
		map.put("address", "shanghai");
		return SUCCESS;
	}
	
	
	
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user) {
		System.out.println("User:  "+user);
		return SUCCESS;
	}
	//��ÿ������ִ��֮ǰ����
	@ModelAttribute
	public void getUser(@RequestParam(value="id", required=false) Integer id,
			Map<String, Object> map) {
		if (id != null) {
			User user = new User(1, "Tom", "123456", "Tom@qq.com", 12);
			map.put("user", user);
		}
	}
	
	@RequestMapping("/testView")
	public String testView() {
		System.out.println("testView");
		return "helloView";
	}
	
	@ResponseBody
	@RequestMapping("/testJson")
	public List<User> testJson(){
		System.out.println("testJson");
		List<User> users = new ArrayList<User>();
		User user1 = new User("zhangsan", "123456", "zhangsan@qq.com", 12);
		User user2 = new User("lisi", "123456", "lisi@qq.com", 13);
		users.add(user1);
		users.add(user2);
		return users;
	}
	
	
	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc,
			@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("desc:  "+desc);
		System.out.println("file originalFilename:  "+file.getOriginalFilename());
		System.out.println(file.getInputStream());
		return SUCCESS;
	}
	
}
