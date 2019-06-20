package liam.bootcamp.goo;
import java.util.ArrayList;
public class ChaChaSlide{
    public static ArrayList<Integer> reverseReverse(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        if(list == null){
            return null;
        }
        
        for(int i = list.size()-1; i >= 0; i--){
            int value = list.get(i);
            newList.add(value);
        }
        return newList;
        
    } 
}