
package tester;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author DanYu
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //initializing variables and arrays and junk
        Scanner read =new Scanner(System.in);
        ArrayList <String> kWords= new ArrayList<>();
            //user inputs keywords (for now, until we get the GUI portion running)
        String[] iWords={"FPS", "STRATEGY", "MULTIPLAYER", "ACTION", "PUZZLE", "RPG"};
            //^preset genres
        String confirm="y";
        System.out.println("Enter in your favorite genres");
        //enter in genres and store into an array
        
        while("y".equals(confirm)){ //user will input y to continue entering genres
            //int i =0;
            kWords.add(read.nextLine().toUpperCase());
            //i++;
            System.out.println("Continue? y/n");
            confirm=read.nextLine();
            //capitalize so it makes a match as long as it is spelled correctly
        }
        //output the genres entered
        System.out.println("Here are your favorite genres");
        
        System.out.println(kWords);
        
        //converting arrays into a list
        //List<String> key = Arrays.asList(kWords); //converting the array into a list
        List<String> gen = Arrays.asList(iWords);
        
        //Check if the preset genres contains the same values as user input
        for(int a=0; a<gen.size(); a++){
            
            if(kWords.contains(iWords[a])){
                System.out.println("Yes!"); //if it does contain, say Yes!
                System.out.println(iWords[a]); //outputs the value that it matches
            }
            
            else{ 
                  //if the arrays are the same amount
                System.out.println("No match!! (" + iWords[a]+ ")");
                
            }
            
        }
        //game test idea
        String[] callOfDuty={"FPS", "ACTION", "MULTIPLAYER"}; //create array with relevant genres to game
        System.out.println("For Call of Duty");
        int cod = 0;
        for(int n=0; n<callOfDuty.length; n++){
            if(kWords.contains(callOfDuty[n])){
                //match keywords and add to a tally for fit
                System.out.println(callOfDuty[n] + ", Match!");
                cod++; 
            }
            else{
                System.out.println("No match!"); // if doesn't match
            }
            
        }
        
        if(cod>=3){ //if all three keywords match, recommend to user
            System.out.println("Call of Duty would be a good fit!");
        }
        else{
            System.out.println("You might not like Call of Duty");
        }
        
    }
    
}
