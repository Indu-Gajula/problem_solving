package org.example.assessment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ISBNPracticeTest {

    @Test
    public void test_is_valid_positive(){
        Assertions.assertTrue(ISBNPractice.isValid("359821507X"));
    }
    @Test
    public void test_is_valid_using_int_stream_positive(){
        Assertions.assertTrue(ISBNPractice.isValidUsingIntStream("359821507X"));
    }

    @Test
    public void test_is_valid_negative(){
        Assertions.assertFalse(ISBNPractice.isValid("3598215079"));
    }
    @Test
    public void test_is_valid_using_int_stream_negative(){
        Assertions.assertFalse(ISBNPractice.isValidUsingIntStream("3598215079"));
    }


    @Test
    public void test_is_valid_false_where_excepion_is_captured(){
        Assertions.assertFalse(ISBNPractice.isValid("359821507x"));
        Assertions.assertFalse(ISBNPractice.isValid("3598215&07"));
    }
    @Test
    public void test_is_valid_using_int_stream_throws_exception(){
        Assertions.assertThrows(NumberFormatException.class,() -> ISBNPractice.isValidUsingIntStream("35982150%9"));
        Assertions.assertThrows(NumberFormatException.class,() -> ISBNPractice.isValidUsingIntStream("35982150k9"));
    }

    @Test
    public void test_is_valid_null(){
        Assertions.assertFalse(ISBNPractice.isValid(null));
    }

    @Test
    public void test_is_valid_using_int_stream_null(){
        Assertions.assertFalse(ISBNPractice.isValid(null));
    }
    
}
