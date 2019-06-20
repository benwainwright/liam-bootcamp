package liam.bootcamp.goo;

import java.util.ArrayList;

public class DoNotGetOdd{
    public static ArrayList<Integer> findEven(ArrayList<Integer> list){
        ArrayList<Integer> evenNums = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                evenNums.add(list.get(i));
            }
        }
        return evenNums;
    }

    public static int getEven(ArrayList<Integer> list){
        if(list == null || list.size() == 0){
            return 0;
        }

        ArrayList<Integer> evenList = findEven(list);
        int runningTotal = 0;
        for(int i = 0; i < evenList.size(); i++){
            runningTotal = runningTotal + evenList.get(i);
        }
        return runningTotal;
    }
}