package com.jap.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/trial")
	@ResponseBody
	public String test()
	{
		int a=40;
		int b=40;
		int c=40;
		int d=40;
		return "this is a just testing /t sum of a and b is" +(a+b+c+d);
	} 
}
