package liam.bootcamp.codility;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;



public class CyclicRotationTest {

  @Test
  public void testFromSpec() {

    int[] array = new int[] {3, 8, 9, 7, 6};
    int[] actual = CyclicRotation.rotate(array, 3);
    int[] expected = new int[] {9, 7, 6, 3, 8};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSingleRotation() {

    int[] array = new int[] {3, 8, 9, 7, 6, 5, 2, 1, 9};
    int[] actual = CyclicRotation.rotate(array, 1);
    int[] expected = new int[] {9, 3, 8, 9, 7, 6, 5, 2, 1};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void testReturnsEmptyArrayIfPassedEmptyArray() {
    int[] array = new int[] {};
    int[] actual = CyclicRotation.rotate(array, 4);
    int[] expected = new int[] {};
    assertArrayEquals(expected, actual);

    array = new int[] {};
    actual = CyclicRotation.rotate(array, 2);
    expected = new int[] {};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testZeroRotationsReturnsSameArray() {
    int[] array = new int[] {};
    int[] actual = CyclicRotation.rotate(array, 0);
    int[] expected = new int[] {};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testNegativeNumbersMakeItRotateBackwards() {
    int[] array = new int[] {3, 8, 9, 7, 6};
    int[] actual = CyclicRotation.rotate(array, -1);
    int[] expected = new int[] {8, 9, 7, 6, 3};

    assertArrayEquals(expected, actual);

    array = new int[] {3, 8, 9, 7, 6};
    actual = CyclicRotation.rotate(array, -3);
    expected = new int[] {7, 6, 3, 8, 9};

    assertArrayEquals(expected, actual);
  }
}
