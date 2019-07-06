package liam.bootcamp.prob;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cLineTest{
    @Test
    public void removingOneNamedArg(){
        String[] inputArray = {"foo", "--baz", "bar"};
        String[] expected = {"foo"};
        String[] actual = cLine.removeNamedArgs();
    }
}