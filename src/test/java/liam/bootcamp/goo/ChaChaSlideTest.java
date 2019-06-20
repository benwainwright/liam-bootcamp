package liam.bootcamp.goo;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ChaChaSlideTest{
    @Test
    public void reverseReverseTestFunctionality(){
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12,45,85,24,65,35,76)); 
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(76, 35, 65, 24, 85, 45, 12));
        ArrayList<Integer> actual = ChaChaSlide.reverseReverse(input);
        assertIterableEquals(expected, actual);
    }


    @Test
    public void nullInNullOut() {
        ArrayList<Integer> input = null;
        ArrayList<Integer> expected = null;
        ArrayList<Integer> actual = ChaChaSlide.reverseReverse(input);
        assertIterableEquals(expected, actual);
    }
}