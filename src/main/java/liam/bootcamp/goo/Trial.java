package liam.bootcamp.goo;

import java.util.ArrayList;

public class Trial{
    public static ArrayList<Integer> removeNumber(ArrayList<Integer> list, int removed){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != removed){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
