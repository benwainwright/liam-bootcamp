package liam.bootcamp.prob;

public class cLine {
    public static void main (String[] args){
        String[] posArgs;
        String[] nameArgs;
        if(args.length > 1){
            removeNamedArgs(args);
            System.out.println("Positional Values: " + posArgs);
            
        } else if (args.length == 1) {
            posArgs = args;
            System.out.println("Positional Values: " + posArgs );
        } else {
            System.out.println("No suitable values entered.");
        }
    }
    public String[] removeNamedArgs(String[] list){
        return null ;
    }
}