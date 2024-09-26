package com.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bean.Customer;

public class CustomerValidation implements Validator
{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Customer.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) 
	{
		
		Customer customer = (Customer) arg0;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "name", "valid.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "password", "valid.password");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "address", "valid.address");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "gender", "valid.gender");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "degree", "valid.degree");
		
		int passLength=customer.getPassword().length();
		if(passLength<6 && passLength>12)
		{
			arg1.rejectValue("password", "valid.password.range");
		}
		
		int selectedLanguages=customer.getLanguage().length;
		if(selectedLanguages<1)
		{
			arg1.rejectValue("language", "valid.language");
		}
		
		
		
	}

}
