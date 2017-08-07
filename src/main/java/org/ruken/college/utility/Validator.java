package org.ruken.college.utility;
import org.ruken.json.StudentPayload;
import org.ruken.json.UserProfilePayload;

import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

  private static final Logger C_log = Logger.getLogger(Validator.class);

  public static boolean validateLetters(String lettersStr) {

    String validLettersRegx = "[A-Z][a-z]+\\s?([A-Z][a-z]+)?";
    Pattern pattern = Pattern.compile(validLettersRegx,Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(lettersStr);
    return matcher.matches();
  }


  public static boolean validateEmailLetters(String emailStr) {

    String validEmailRegx = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    Pattern pattern = Pattern.compile(validEmailRegx,Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(emailStr);
    return matcher.matches();

    }

  public static boolean validatePwdLetters(String pwdStr) {

    String validPwdRegx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    Pattern pattern = Pattern.compile(validPwdRegx,Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(pwdStr);
    return matcher.matches();

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

      if (!validateEmailLetters(payload.getEmail())) {
      	break MB;
      } /*endif*/

      if (!validatePwdLetters(payload.getPassword())) {
        break MB;
      } /*endif*/

      if ((TfirstName = payload.getFirstName()) == null || TfirstName.isEmpty() || !validateLetters(TfirstName)) {
        C_log.error("Error, input first name was null");
        break MB;
      } /*endif*/

      if ((TlastName = payload.getLastName()) == null || TlastName.isEmpty() || !validateLetters(TlastName)) {
        C_log.error("Error, input last name was null");
        break MB;
      } /*endif*/

      Trc = true;
      C_log.info("Input UserProfilePayload was valid!");

    } /*endMB*/
	
    return(Trc); 
  } /* END OF validateUserProfilePayload */



} /* END OF class Validator */


/* END OF SOURCE FILE */
