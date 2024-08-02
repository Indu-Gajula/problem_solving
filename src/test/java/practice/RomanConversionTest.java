package practice;

import org.example.exception.CannotConvertRomanToLongException;
import org.example.practice.RomanConversion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class RomanConversionTest {



    @Test
    public void testConvertToLongTrue() throws Exception {
        assertEquals(1045, RomanConversion.convertRomanToLong("MVL"));
    }
    @Test
    public void testConvertToLongFalse() throws Exception {
        assertNotEquals(50, RomanConversion.convertRomanToLong("DCXLI"));
    }
    @Test
    public void testConvertToLongFalse1() throws Exception {
        assertThrows(CannotConvertRomanToLongException.class, () -> RomanConversion.convertRomanToLong("LYV"));
        assertThrows(CannotConvertRomanToLongException.class, () -> RomanConversion.convertRomanToLong("xyz"));
    }

}
