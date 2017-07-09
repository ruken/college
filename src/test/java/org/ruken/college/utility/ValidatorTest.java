package org.ruken.college.utility;

import org.junit.Test;
import org.ruken.json.StudentPayload;

import static org.junit.Assert.*;

public class ValidatorTest {


    @Test
    public void testMyValidatorMethod_validateWalletIsEmpty() {
        Validator myVal = new Validator();

        StudentPayload studentPayload = new StudentPayload();
        studentPayload.setFirstName("Ruken");
        studentPayload.setLastName("Oral");

        String resultToTest = myVal.validate(studentPayload);
        assertEquals("Error Wallet Missing", resultToTest);

    }


}