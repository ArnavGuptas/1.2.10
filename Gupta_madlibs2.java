import java.util.Scanner;
public class Gupta_madlibs2 {
    //This function gets the input from the user given the type of word neccesary as a paramater
    static String getInput(String wordType){
        //This line creates a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a " + wordType +": ");
        String input = sc.nextLine();
        return input;
    }
    //This function prints the story given all of the words the user entered as string parameters
    static void scanStory(String story){
        int n = 0;
        int adj = 0;
        int adv = 0;
        int v = 0;
        while (true){
            if (n != -1){
                n = story.indexOf("noun", n + 4);
                if (n != -1){
                    System.out.println("Noun at Index: " + n);
                }
                else{
                    break;
                }
            }
        }
        while (true){
            if (adj != -1){
                adj = story.indexOf("adjective", adj + 9);
                if (adj != -1){
                    System.out.println("Adjective at Index: " + adj);
                }
                else{
                    break;
                }
            }
        }
        while (true){
            if (adv != -1){
                adv = story.indexOf("adverb", adv + 6);
                if (adv != -1){
                    System.out.println("Adverb at Index: " + adv);
                }
                else{
                    break;
                }
            }
        }
        while (true){
            if (v != -1){
                v = story.indexOf("verb", v + 4);
                if (v != -1){
                    System.out.println("Verb at Index: " + v);
                }
                else{
                    break;
                }
            }
        }
    }
    //This is the main function that runs thingsun
    public static void main(String[]args){
        String story = "A adjective day began, and a noun decided to verb adverb through the park. Oh my it cried, I see a adjective noun! The noun began to verb adverb, and the adjective creature chased it! It was a truly adjective sight.";
        //Calls to methods to get inputs and print story
        scanStory(story);
    }
}
