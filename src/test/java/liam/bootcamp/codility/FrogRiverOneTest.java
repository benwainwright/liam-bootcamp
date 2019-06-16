package liam.bootcamp.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogRiverOneTest {
  @Test
  public void testFromSpec() {
    int[] array = new int[] {1, 3, 1, 4, 2, 3, 5, 4};

    int actual = FrogRiverOne.solution(5, array);

    assertEquals(actual, 6);
  }
}
