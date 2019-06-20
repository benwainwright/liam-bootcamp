package liam.bootcamp.goo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FroggerTest{
    @Test
    public void riverCrossWhenFrogCanCross(){
        int inputInt = 5;
        int[] inputArray = {4, 3, 2, 1, 5}; 
        int expected = 4;
        int actual = Frogger.riverCross(inputInt, inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void riverCrossWhenFrogCanCrossTwo(){
        int inputInt = 8;
        int[] inputArray = {8, 1, 2, 5, 7, 4, 6, 3}; 
        int expected = 7;
        int actual = Frogger.riverCross(inputInt, inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void riverCrossWhenIntIsZero(){
        int inputInt = 0;
        int[] inputArray = {4, 3, 6, 8, 2, 1, 5}; 
        int expected = -1;
        int actual = Frogger.riverCross(inputInt, inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void riverCrossWhenArrayIsEmpty(){
        int inputInt = 5;
        int[] inputArray = {};
        int expected = -1;
        int actual = Frogger.riverCross(inputInt, inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void riverCrossWhenFrogCanNotCross(){
        int inputInt = 5;
        int[] inputArray = {4, 3, 6, 8, 2, 1, 5}; 
        int expected = -1;
        int actual = Frogger.riverCross(inputInt, inputArray);
        assertEquals(expected, actual);
    }

}