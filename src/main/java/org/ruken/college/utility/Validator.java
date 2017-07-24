package org.ruken.college.utility;
import org.ruken.json.StudentPayload;
import org.ruken.json.UserProfilePayload;

import org.apache.log4j.Logger;

public class Validator {

  private static final Logger C_log = Logger.getLogger(Validator.class);
	
  String error = "Error";
	
  public String validate(StudentPayload payload) {
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

  public static boolean validateUserProfilePayload(UserProfilePayload payload) {
    /*------- Local variables -------*/
    boolean Trc = false;
    String  TfirstName = null;
    String  TlastName  = null;
    /*-------- Start of Code --------*/
    MB: {
      C_log.info("Validating input UserProfilePayload: "+payload);
      if (payload == null) {
        C_log.error("Error, input UserProfilePayload was null");
        break MB;
      } /*endif*/

      if (!validateEmail(payload.getEmail())) {
      	break MB;
      } /*endif*/

      if ((TfirstName = payload.getFirstName()) == null || TfirstName.isEmpty()) {
        C_log.error("Error, input first name was null");
        break MB;
      } /*endif*/

      if ((TlastName = payload.getLastName()) == null || TlastName.isEmpty()) {
        C_log.error("Error, input last name was null");
        break MB;
      } /*endif*/

      Trc = true;
      C_log.info("Input UserProfilePayload was valid!");

    } /*endMB*/
	
    return(Trc); 
  } /* END OF validateUserProfilePayload */

 public static boolean validateEmail(String Pemail) {
    /*------- Local variables -------*/
    boolean Trc = false;
    /*-------- Start of Code --------*/
    MB: {

      if (Pemail  == null || Pemail.isEmpty()) {
        C_log.error("Error, input email was null");
        break MB;
      } /*endif*/

      Trc = true;
      C_log.info("Input UserProfilePayload was valid!");

    } /*endMB*/
	
    return(Trc); 
  } /* END OF validateUserProfilePayload */ 
} /* END OF class Validator */


/* END OF SOURCE FILE */
