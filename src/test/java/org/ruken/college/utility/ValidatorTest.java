package org.ruken.college.utility;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.ruken.college.jpa.model.UserProfile;
import org.ruken.json.StudentPayload;

import static org.junit.Assert.*;

public class ValidatorTest {

    private static final Logger C_log = Logger.getLogger(ValidatorTest.class);

   /* @Test
    public void testMyValidatorMethod_validateWalletIsEmpty() {
        Validator myVal = new Validator();

        StudentPayload studentPayload = new StudentPayload();
        studentPayload.setFirstName("Ruken");
        studentPayload.setLastName("Oral");

        String resultToTest = myVal.validate(studentPayload);
        assertEquals("Error Wallet Missing", resultToTest);

    } */


    @Test
    public void testMyValidatorMethod_validateEmailRegx() {
        boolean emailBoolean;

        emailBoolean = Validator.validateEmailLetters("rukenoral@gmail.com");
        C_log.info(emailBoolean);
        emailBoolean = Validator.validateEmailLetters("r u ke n o r al@ g m ail");
        C_log.info(emailBoolean);
        emailBoolean = Validator.validateEmailLetters("$ru$3lkejbr");
        C_log.info(emailBoolean);
    }

    @Test
    public void testMyValidatorMethod_validatePwdRegx() {
        boolean emailBoolean;

        emailBoolean = Validator.validatePwdLetters("1234WRgtg$$5");
        C_log.info(emailBoolean);
        emailBoolean = Validator.validatePwdLetters("12Five63/");
        C_log.info(emailBoolean);
        emailBoolean = Validator.validatePwdLetters("$ru$3lkejbr");
        C_log.info(emailBoolean);
    }


    @Test
    public void testMyValidatorMethod_validateLettersRegx() {
        boolean bl;

        bl = Validator.validateLetters("Ruken O34ght");
        C_log.info(bl);
        bl = Validator.validateLetters("rukenoral");
        C_log.info(bl);
        bl = Validator.validateLetters("$521ruken Oral");
        C_log.info(bl);
        bl = Validator.validateLetters("ruken oral");
        C_log.info(bl);
    }

}