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

    @Test
    public void testJustThreeNumbers() {
      int[] array = {1, 1, 2};
      int actual = OddOccurrencesInArray.findOddOccurrences(array);
      assertEquals(2, actual);

      int[] array2 = {2, 1, 1};
      int actual2 = OddOccurrencesInArray.findOddOccurrences(array2);
      assertEquals(2, actual2);

      int[] array3 = {1, 2, 1};
      int actual3 = OddOccurrencesInArray.findOddOccurrences(array3);
      assertEquals(2, actual3);

      int[] array4 = {2, 2, 1};
      int actual4 = OddOccurrencesInArray.findOddOccurrences(array4);
      assertEquals(1, actual4);

      int[] array5 = {2, 2, 1};
      int actual5 = OddOccurrencesInArray.findOddOccurrences(array5);
      assertEquals(1, actual5);
    }

    @Test
    public void testRepeatedPairs() {
      int[] array = {7, 7, 7, 7, 4};
      int actual = OddOccurrencesInArray.findOddOccurrences(array);
      assertEquals(4, actual);

      int[] array1 = {7, 7, 7, 7, 1, 1, 1, 1, 0};
      int actual1 = OddOccurrencesInArray.findOddOccurrences(array1);
      assertEquals(0, actual1);
    }

    @Test
    public void testLongStringOfNumbers() {
      int[] array = {9, 1, 3, 2, 4, 4, 2, 1, 3, 2, 2, 3, 7, 9, 2, 1, 1, 2, 7};
      int actual = OddOccurrencesInArray.findOddOccurrences(array);
      assertEquals(3, actual);
    }
}
