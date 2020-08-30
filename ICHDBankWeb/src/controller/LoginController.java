package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import task3.Account;
import task3.Customer;
import task3.Loginservice;

@Controller
@RequestMapping(value="/Loginview.jsp")
public class LoginController 
{
	Loginservice ls;
	public void setLoginService(Loginservice ls1)
	{
	   ls=ls1;	
		
	}
	@RequestMapping(method=RequestMethod.GET)
	public String showloginview(ModelMap model)
	{
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "loginView";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String processform(@ModelAttribute(value="customer")Customer customer,ModelMap model)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Account act=(Account) ac.getBean("acc");
		String str="Account Number: "+act.getAccnum();
		model.addAttribute("accountno",str);
		String str1="Account Balance : "+act.getBalance();
		model.addAttribute("balance",str1);
		model.addAttribute("hellomessage",ls.sayhello(customer.getUser()));
		return "userAccount";
	}

}
