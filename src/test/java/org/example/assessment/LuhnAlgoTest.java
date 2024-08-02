package org.example.assessment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class LuhnAlgoTest {


@Test

    public void tetsIsAValidCardWhenValid(){

        //given
//        String cardNumber = "4539148803436467";
//
//        //when
//        boolean response = LuhnAlgo.isAValidCard(cardNumber);

        assertTrue(LuhnAlgo.isAValidCard("4539148803436467"));

    }
}
