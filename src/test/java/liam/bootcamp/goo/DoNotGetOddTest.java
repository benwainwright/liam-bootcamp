package liam.bootcamp.goo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class DoNotGetOddTest{
    @Test
    public void getEvenTestFunctionality(){
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12,45,85,24,65,35,76)); 
        int expected = 112;
        int actual = DoNotGetOdd.getEven(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void getEvenTestNoEvenNum(){
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(45,85,65,35)); 
        int expected = 0;
        int actual = DoNotGetOdd.getEven(input);
        assertEquals(expected, actual);
    }

    @Test
    public void getEvenTestNull(){
        ArrayList<Integer> input = null; 
        int expected = 0;
        int actual = DoNotGetOdd.getEven(input);
        assertEquals(expected, actual);
    }

    @Test
    public void getEvenTestEmptyList(){
        ArrayList<Integer> input = new ArrayList<Integer>(); 
        int expected = 0;
        int actual = DoNotGetOdd.getEven(input);
        assertEquals(expected, actual);
    }
}