package liam.bootcamp.codility;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RangeQueryTest {

  @Test
  public void testFromSpec() {
    int[] p = new int[] {2, 5, 0};
    int[] q = new int[] {4, 5, 6};

    String dna = "CAGCCTA";
    int[] actual = RangeQuery.solution(dna, p, q);

    assertArrayEquals(new int[] {2, 4, 1}, actual);
  }
}
