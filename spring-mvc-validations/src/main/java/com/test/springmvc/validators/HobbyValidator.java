package com.test.springmvc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	String expectedValues;
	
	public void initialize(IsValidHobby isValidHooby) {
		expectedValues = isValidHooby.expectedHobbies();
		
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (null == value) {
			return false;
		}
		if (value.matches(expectedValues)) {
			return true;
		} else {
			return false;
		}
	}

}
