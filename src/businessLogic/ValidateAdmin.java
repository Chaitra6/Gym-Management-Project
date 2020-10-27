package businessLogic;

import model.Admin;

public class ValidateAdmin {
	
	public boolean validate(Admin admin) {
		
		
		if(admin.getEmail().equals("admin") && admin.getPassword().equals("admin123"))
			return true;
		else 
			return false;
	}

}
