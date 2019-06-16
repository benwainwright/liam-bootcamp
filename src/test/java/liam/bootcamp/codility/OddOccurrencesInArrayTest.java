package liam.bootcamp.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class OddOccurrencesInArrayTest {

    @Test
    public void testExampleFromSpec() {
        int[] array = {9, 3, 9, 3, 9, 7, 9};

        int actual = OddOccurrencesInArray.findOddOccurrences(array);

        assertEquals(7, actual);
    }
}
