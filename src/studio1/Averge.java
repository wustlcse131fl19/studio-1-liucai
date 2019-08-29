package studio1;

import support.cse131.ArgsProcessor;

public class Averge {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("Input an x");
        int y = ap.nextInt("Input an y");
        double z = (x+y)/2.0;
                System.out.println("The average of x+y is"+z);
}}

//string--character
//int---numeric
//boolean---logical
