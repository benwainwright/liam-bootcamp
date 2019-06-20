package liam.bootcamp.codility;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OddOccurrencesInArray {

    public static ArrayList<Integer> arrayToList(int[] array){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
    public static void removePairFromStart (ArrayList<Integer> list){
        int removeValue = list.get(0);
        for(int i = 1; i > list.size(); i++){
            if(list.get(i)== removeValue){
                list.remove(i);
                list.remove(0);
            }
        }
    }
    public static int findOddOccurrences(int[] array) {
        if(array.length==1){
            return array[0];
        }
        else{
            ArrayList<Integer> list = arrayToList(array);
            int counter = list.size();
            int newCounter = 0;
            for(int i = 1;list.size()>1 && counter != newCounter;i++){
                counter = list.size();
                removePairFromStart(list);
                newCounter = list.size();
            }
            return list.get(0);
        }
    }
    
}

