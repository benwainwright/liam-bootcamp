package liam.bootcamp.codility;

public class PassingCars {
  public static int solution(int[] array) {
    int count = 0;
    for(int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        for(int ii = i + 1; ii < array.length; ii++) {
          if(array[ii] == 1) {
            if(count + 1 > 1000000000) {
              return -1;
            }
            count++;
          }
        }
      }
    }
    return count;
  }
}
