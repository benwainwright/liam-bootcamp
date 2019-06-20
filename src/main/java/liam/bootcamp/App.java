package liam.bootcamp;

import java.util.Scanner;

public class App{
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        if(name.equals("Ben")){
            System.out.println("Let me sleep");
        } 
        else if(name.equals("Will")){
            System.out.println("Go away");
        }
        else if(name.equals("Alec")){
            System.out.println("Treat for loki?");
        }
        else if(name.equals("Liam")){
            System.out.println("Lunch?");
        }
        System.out.println(findLength(name));
    }
    public static int findLength(String imp){
        int count = 0;
        try {
            while(true) {
                imp.charAt(count);
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
}