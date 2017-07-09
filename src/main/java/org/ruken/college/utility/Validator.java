package org.ruken.college.utility;
import org.ruken.json.StudentPayload;

public class Validator {
	
	String error = "Error";
	
	public String validate(StudentPayload payload){

		
	if (payload.getFirstName()  == null){
		return error + " First Name Missing";
		}
	
	if (payload.getLastName()  == null){
		return error + " Last Name Missing";
		}
	
	if (payload.getWallet()  == null){
		return error + " Wallet Missing";
		}
	
	return null; 
}
}
