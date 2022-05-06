package com.core.integra.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	
	UserDao user;
	UserDaoImp udi;
	@RequestMapping("home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("register")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping(path="registers",method=RequestMethod.POST)
	public String registers(@ModelAttribute Register r)
	{	
		
		
		
		
		
		String name = r.getName();
		String email = r.getEmail();
		String city = r.getCity();
		String pass = r.getPass();
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/core/integra/base/controller/config.xml");
		
		UserDao ud = (UserDao) con.getBean("userdao1");
		
		Register rs = new Register();
		rs.setName(name);
		rs.setEmail(email);
		rs.setCity(city);
		rs.setPass(pass);
		
		
		int res =  ud.insert(rs);
   		
      	 System.out.println("data inserted successfully"+res);
       
		return "register";
	}
	
	@RequestMapping("valid")
	public String valid()
	{
ApplicationContext con = new ClassPathXmlApplicationContext("com/core/integra/base/controller/config.xml");
		
		UserDao ud = (UserDao) con.getBean("userdao1");
		
		
		Register res = ud.select("Mahi");
		
		
		return "";
	}
	
	@RequestMapping("login")
	public String login()
	{
		return "login";
	}
	//login validation controller
	@RequestMapping("loginvalidation")
	
	public @ResponseBody String loginvalidation(@ModelAttribute login l)
	{
		
		
		
		String email = l.getEmail();
		String password = l.getPassword();
		
ApplicationContext con = new ClassPathXmlApplicationContext("com/core/integra/base/controller/config.xml");
		
		UserDaoImp ud =  (UserDaoImp) con.getBean("userdao1");
		
		
		
		boolean loginf = ud.valid(email, password);
		
		System.out.println(loginf);
		
		if(loginf==true)
		{
			return "success";
		}
		else
		{
			return "fail";
		}
		
		
		
		
	}
	
}
