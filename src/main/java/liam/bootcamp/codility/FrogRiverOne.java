package liam.bootcamp.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
  public static int solution(int x, int[] array) {
    Set<Integer> leaves = new HashSet<Integer>();

    for(int i = 0; i < array.length; i++) {
      leaves.add(array[i]);

      if(leaves.size() == x) {
        return i;
      }
    }

    return -1;
  }
}
