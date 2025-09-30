import java.util.Scanner;
public class Gupta_madlibs {
    static String getInput(String wordType){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a " + wordType +": ");
        String input = sc.nextLine();
        return input;
    }
    static void printStory(String input1, String input2, String input3, String input4, String input5){
        System.out.println("It was a " + input1 + " day near the " + input2 + ". We started " + input3 + " through the woods when suddenly, a " + input4 + " squirrel zoomed across our path. It looked very " + input5 + " and quickly disappeared up a tree.");
    }
    public static void main(String[]args){
        System.out.println("It was a (adjective) day near the (noun). We started (verb) through the woods when suddenly, a (adverb) squirrel zoomed across our path. It looked very (adjective) and quickly disappeared up a tree.")
        String s1 = getInput("adjective");
        String s2 = getInput("noun");
        String s3 = getInput("verb");
        String s4 = getInput("adverb");
        String s5 = getInput("adjective");
        printStory(s1, s2, s3, s4, s5);
    }
}
