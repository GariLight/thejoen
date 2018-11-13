package mvc.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import mvc.model.Stud;

public class LoginValidator implements Validator {

	
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		System.out.println("supports()");
		return Stud.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate() 진입!");
		
		Stud st = (Stud) target;
		if(st.getId()==null || st.getId().trim().equals(""))
			errors.rejectValue("id", "invalid.id","id에러");
		if(st.getPw()==null || st.getPw().trim().equals(""))
			errors.rejectValue("pw", "invalid.pw","pw에러");


	}

}
