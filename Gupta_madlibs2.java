import java.util.Scanner;
public class Gupta_madlibs2 {
    //This function scans the story which is entered as a string paramter and returns the story but with all of the places where the word "noun" was replaced with a user inputted noun 
    static String scanNounStory(String story){
        //Have to define this before because of if statment
        int n = 0;
        String newStory = story;
        //This code finds the index of a noun using indexof, then loops and finds the index of a noun only looking after where the first noun is
        //Each time it finds a noun it prints it, then asks the user for their input and replaces the word noun with user input, and if nothing is found it will break the loop and return the final story 
        while (true){
            //.indexOf returns -1 if there is nothing found, so if there are no nouns it won't do anything
            if (n != -1){
            //Theres a slight oversight here, it wont look for the word noun in the first four letters because i added the +4
            //The +4 is neccesary though because otherwise it starts looking for the next word noun at the beginning of the word noun so it finds the same noun over and over
                n = story.indexOf("noun", n + 4);
                if (n != -1){
                    //This is the code that asks the user for their input, then uses substring to make a new string, which is done over and over until no more instances of "noun" are left in the story
                    System.out.println("Noun at Index: " + n);
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a Noun: ");
                    String input = sc.nextLine();
                    newStory = newStory.substring(0, n) + input + newStory.substring(n + 4);
                }
                else{
                    break;
                }
            }
        }
        return newStory;
    }
//More of the same just with different parts of speech
    static String scanVerbStory(String story){
        int n = 0;
        String newStory = story;
        while (true){
            if (n != -1){
                n = story.indexOf("verb", n + 4);
                if (n != -1){
                    System.out.println("Verb at Index: " + n);
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a Verb: ");
                    String input = sc.nextLine();
                    newStory = newStory.substring(0, n) + input + newStory.substring(n + 4);
                }
                else{
                    break;
                }
            }
        }
        return newStory;
    }

    static String scanAdjStory(String story){
        int n = 0;
        String newStory = story;
        while (true){
            if (n != -1){

     
                n = story.indexOf("adjective", n + 4);
                if (n != -1){
                    System.out.println("Adjective at Index: " + n);
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a Adjective: ");
                    String input = sc.nextLine();
                    newStory = newStory.substring(0, n) + input + newStory.substring(n + 9);
                }
                else{
                    break;
                }
            }
        }
        return newStory;
    }

    static String scanAdvStory(String story){
        int n = 0;
        String newStory = story;
        while (true){
            if (n != -1){

     
                n = story.indexOf("adverb", n + 4);
                if (n != -1){
                    System.out.println("Adverb at Index: " + n);
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a Noun: ");
                    String input = sc.nextLine();
                    newStory = newStory.substring(0, n) + input + newStory.substring(n + 6);
                }
                else{
                    break;
                }
            }
        }
        return newStory;
    }
//All four of the scan functions were one much nicer function, but I had to seperate them because I didn't know how to return mulitple things in one method
    //This is the main function that runs things
    public static void main(String[]args){
        String story = "A adjective day began, and a noun decided to verb adverb through the park. Oh my it cried, I see a adjective noun! The noun began to verb adverb, and the adjective creature chased it! It was a truly adjective sight.";
        //Calls to methods to get inputs and print story
        //Each function only replaces one of the parts of speech, so we need to run all four with the same string
        String newStory = scanNounStory(story);
        String newerStory = scanAdjStory(newStory);
        String newsestStory = scanAdvStory(newerStory);
        String newesterStory = scanVerbStory(newsestStory);
        System.out.println(newesterStory);
        
    }
}
