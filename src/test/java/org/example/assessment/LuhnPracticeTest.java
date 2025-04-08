package org.example.assessment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LuhnPracticeTest {

    @Test
    public void test_is_valid(){
        // prepare
        LuhnPractice luhn = new LuhnPractice();
        String number  = "";
        //execute
        boolean isValid = luhn.isValid(number);
        //assert

        Assertions.assertTrue(isValid);
    }

    @Test
    public void test_is_not_valid(){
        // prepare
        LuhnPractice luhn = new LuhnPractice();
        String number  = "424242424242642";
        //execute
        boolean isValid = luhn.isValid(number);
        //assert
        Assertions.assertFalse(isValid);
    }

//    @Test
//    public void test_is_not_valid_numberformatexception(){
//        // prepare
//        LuhnPractice luhn = new LuhnPractice();
//        String number  = "43#$%9";
//
//        Assertions.assertThrows(Exception.class, () -> luhn.isValid(number));
//    }


}
