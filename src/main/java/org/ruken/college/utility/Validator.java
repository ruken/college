package main.java.org.ruken.college.utility;
import org.ruken.json.StudentPayload;

public class Validator {
	
	String error = "Error";
	
	public String validate(StudentPayload payload){

		
	if (payload.getFirstName()  == null){
		return error;
		}
	
	if (payload.getLastName()  == null){
		return error;
		}
	
	if (payload.getWallet()  == null){
		return error;
		}
	
	return null; 
}
}
