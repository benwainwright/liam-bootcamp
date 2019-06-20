package liam.bootcamp.goo;

public class Frogger {
    public static int riverCross(int river, int[] leaves){
        int frogPosition = 0;
        int highestIndex = 0;
        for(int i = 0;i < leaves.length; i++){
            for (int ii = 0; ii < leaves.length; ii++) {
                if (leaves[ii] == frogPosition + 1) {
                    if(ii > highestIndex){
                        highestIndex = ii;
                    }
                    frogPosition++;
                    break;
                }
            }
        }
        if(river == frogPosition){
            return highestIndex;
        } 
        else{
            return -1;
        }
    }
}