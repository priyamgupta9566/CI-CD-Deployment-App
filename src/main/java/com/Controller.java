package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	public String Hello()
	{
		return "Hello!!! ";
	}
	
	public String Welcome()
	{
		System.out.println("");
		return "Welcome to SpringBoot Application for CI/CD Deployement";
	}
	
	public String Developer()
	{
		System.out.println("");
		return "Developed by Priyam Gupta";
	}
	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String printHello()
	{
		String result = Hello() + Welcome() + Developer();
		System.out.println(result);
		return result;
	}
}
