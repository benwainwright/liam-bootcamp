package liam.bootcamp.codility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PassingCarsTest {

  @Test
  public void testFromSpec() {
    int[] array = new int[] {0, 1, 0, 1, 1};

    int actual = PassingCars.solution(array);

    assertEquals(5, actual);
  }
}
