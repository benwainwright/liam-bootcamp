package liam.bootcamp.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogRiverOneTest {
  @Test
  public void testFromSpec() {
    int[] array = new int[] {1, 3, 1, 4, 2, 3, 5, 4};
    int actual = FrogRiverOne.solution(5, array);
    assertEquals(6, actual);
  }

  @Test
  public void testSingleTimeSlot() {
    int[] array = new int[] {1};
    int actual = FrogRiverOne.solution(1, array);
    assertEquals(0, actual);
  }

  @Test
  public void testFrogCantCross() {
    int[] array = new int[] {1, 4, 2, 4, 2, 3, 7, 4, 5, 9};
    int actual = FrogRiverOne.solution(9, array);
    assertEquals(-1, actual);
  }

  @Test
  public void testTinyStringCannotCrossTillEnd() {
    int[] array = new int[] {1, 4, 2, 3};
    int actual = FrogRiverOne.solution(4, array);
    assertEquals(3, actual);
  }

  @Test
  public void testXisFarToFarAway() {
    int[] array = new int[] {1, 4, 2, 3};
    int actual = FrogRiverOne.solution(44, array);
    assertEquals(-1, actual);
  }

  @Test
  public void testMuchBiggerString() {
    int[] array = new int[] {1, 4, 3, 7, 7, 5, 15, 3, 4, 9, 6, 10, 14, 8, 13, 12, 11, 2, 11, 12, 10, 4, 4, 9, 3, 1 };
    int actual = FrogRiverOne.solution(15, array);
    assertEquals(17, actual);
  }


}
