package liam.bootcamp.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cLine {
    public static void main (String[] args){
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(args));
        if(input.size() > 1){
            removeNamedArgs(input);
            System.out.println("Positional Values: " + input);
            System.out.println("Named Value Arguments:");
            printNamedArgs(nameArgs);
        } else if (input.size() == 1) {
            System.out.println("Positional Values: " + input );
        } else {
            System.out.println("No suitable values entered.");
        }
    }
    public HashMap<String, String> removeNamedArgs(ArrayList<String> list){
        HashMap<String, String> nameArgs = new HashMap<String, String>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).contains("--")){
                nameArgs.put(list.get(i), list.get(i + 1));
                list.remove(i);
                list.remove(i + 1);
            }
        }
        return nameArgs;
    }
    public void printNamedArgs(HashMap<String, String> map){
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map<K,V>.Entry mentry = (Map.Entry)iterator.next();
            System.out.println(mentry.getKey() + " = " + mentry.getValue())
        }
    }
}