package liam.bootcamp.prob;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cLineTest{
    @Test
    public void removingOneNamedArg(){
        String[] inputArray = {"foo", "--baz", "bar"};
        String[] expected = {"foo"};
        String[] actual = cLine.seperateNamedArgs(inputArray);
        assertEquals(expected, actual);
    }
    @Test
    public void removingTwoNamedArg(){
        String[] inputArray = {"foo", "--baz", "bar", "bosh", "--biz", "bop", "bash"};
        String[] expected = {"foo", "bosh", "bash"};
        String[] actual = cLine.seperateNamedArgs(inputArray);
        assertEquals(expected, actual);
    }
    @Test
    public void removingNoNamedArg(){
        String[] inputArray = {"foo"};
        String[] expected = {"foo"};
        String[] actual = cLine.seperateNamedArgs(inputArray);
        assertEquals(expected, actual);
    }
    @Test
    public void removingOneNamedArg(){
        String[] inputArray = {"foo", "--baz", "bar"};
        String[] expected = {"foo"};
        String[] actual = cLine.removeNamedArgs(inputArray);
        assertEquals(expected, actual);
    }
}