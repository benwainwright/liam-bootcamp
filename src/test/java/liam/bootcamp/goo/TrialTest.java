package liam.bootcamp.goo;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TrialTest{
    @Test
    public void testRemoval(){
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10, 16, 16, 16, 16, 18, 19));
        ArrayList<Integer> actual = Trial.removeNumber(input, 16);
        ArrayList<Integer> expected= new ArrayList<Integer>(Arrays.asList(10, 18, 19));

        assertIterableEquals(expected, actual);
    }
}