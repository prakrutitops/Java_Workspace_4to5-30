package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Customer;
import com.validation.CustomerValidation;

@Controller
public class MyController 
{
	
	public MyController() 
	{
		// TODO Auto-generated constructor stub
	}
	
	CustomerValidation customervalidation;
	
	public CustomerValidation getCustomervalidation() 
	{
		return customervalidation;
	}

	public void setCustomervalidation(CustomerValidation customervalidation) 
	{
		this.customervalidation = customervalidation;
	}
	
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	private ModelAndView customer()
	{
		System.out.println("Controller");
		Customer customer=new Customer();
		customer.setId(1);
		ModelAndView model=new ModelAndView("customer","customer",customer);
		return model;
	}
	@ModelAttribute("customerDynamic")
	private Map<String, List<String>> dynamic()
	{
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		
		List<String> languages=new ArrayList<String>();
		languages.add("Java");
		languages.add("Testing");
		languages.add("Android");
		languages.add(".Net");
		languages.add("iPhone");
		languages.add("PHP");
		
		map.put("languages", languages);
		

		List<String> education=new ArrayList<String>();
		education.add("");
		education.add("BE");
		education.add("ME");
		education.add("BCA");
		education.add("MCA");
		education.add("PhD");

		map.put("degrees", education);



		return map;
	}
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	private String addCustomer(@ModelAttribute("customer")@Validated Customer customer,ModelMap model,BindingResult result,SessionStatus status)
	{
		String returnVal="show";
		customervalidation.validate(customer, result);
		
		if(result.hasFieldErrors())
		{
			returnVal="customer";
		}
		else
		{
			status.setComplete();
			model.addAttribute("customer",customer);
		}
		return returnVal;
		
	}
	
	
	
}
