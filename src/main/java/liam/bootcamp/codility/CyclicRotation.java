package liam.bootcamp.codility;

import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {

  public static int[] rotate(int[] array, int k) {
    for(int i = 0; i < k; i++) {
      array = rotate(array);
    }
    return array;
  }

  private static int[] rotate(int[] array) {
    List<Integer> numbers = toList(array);
    if(numbers.size() > 0) {
      int element = numbers.remove(numbers.size() - 1);
      numbers.add(0, element);
    }
    return numbers.stream().mapToInt(Integer::intValue).toArray();

  }

  private static List<Integer> toList(int[] array) {
    List<Integer> numbers = new ArrayList<>();
    for(int i : array) {
      numbers.add(i);
    }
    return numbers;
  }
}
