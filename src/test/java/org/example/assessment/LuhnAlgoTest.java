package org.example.assessment;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@ExtendWith(MockitoExtension.class)
public class LuhnAlgoTest {
    @Test
    void tetsIsAValidCardWhenValid(){

        assertTrue(LuhnAlgo.isAValidCard("4539148803436467"));

    }
}
