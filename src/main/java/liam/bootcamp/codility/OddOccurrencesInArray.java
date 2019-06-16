package liam.bootcamp.codility;

import java.util.HashMap;

public class OddOccurrencesInArray {

    public static int findOddOccurrences(int[] array) {

      HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
      for(int i = 0; i < array.length; i++) {
        int num = array[i];
        if(!numbers.containsKey(num)) {
          numbers.put(num, 1);
        } else {
          numbers.put(num, numbers.get(num) + 1);
        }
      }

      for(int i : numbers.keySet()) {
x        if(numbers.get(i) % 2 != 0) {
          return i;
        }
      }

      return 0;
    }
}
