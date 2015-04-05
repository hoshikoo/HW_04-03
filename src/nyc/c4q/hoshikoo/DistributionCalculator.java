package nyc.c4q.hoshikoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Hoshiko on 4/1/15.
 */
//Character Distributions
//
// Create a class to calculate the distribution of characters in the contents of a text file.
// Your class called DistributionCalculator should implement a method calculate(File textFile) which
// accepts as input a Text file. It reads the contents of the file and returns an ArrayList which
// contains the distribution/percentage of characters (a-z) in the text file.
// You should lowercase lines before you do the calculation.
// Call the calculate method from main and print the distribution.
// You can ignore characters which do not belong in the range(a-z) for doing your calculation.


public class DistributionCalculator
{
//    Your class called DistributionCalculator should implement a method calculate(File textFile) which
//    accepts as input a Text file.

    public static void calculate(File textFile) throws FileNotFoundException
    {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        ArrayList<Character> sortedChars;

        Scanner scanner = new Scanner(textFile);

        long fileSize = 0;

        while(scanner.hasNext()) {
            //lowercase lines before you do the calculation.
            String word = scanner.next().toLowerCase();

            for(int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                //Ignore characters which do not belong in the range(a-z)
                if(letter >= 'a' && letter <= 'z'){
                    //Everytime find character in the range(a-z), add the length of the words to
                    //filesize so that file size only contains the lettercharacter in the range(a-z)
                    fileSize++;

                    //return the value (count of each character)of HashMap charCount
                    Integer letterCount = charCount.get(letter);


                    if(letterCount != null){
                        //if there is the count for the character, just add 1 to the letterCount.
                        letterCount++;
                    }else{
                        //if the character count is 0 because it is the first time to add to HashMap
                        // set the letterCount as 1 as value.
                        letterCount = 1;
                    }

                    //add letter and letterCount to the HashMap.
                    //HashMap will ignore the duplicate letter.

                    charCount.put(letter, letterCount);
                }
            }
        }

        //HashMap is not sortable (indexable) so add all the characters in HashMap to Set called key
        //so that it can be sorted.
        Set<Character> keys = charCount.keySet();

        //Put the keys (the list of characters of HashMap) to ArrayList called sortedChar.
        sortedChars = new ArrayList<Character>(keys);

        //sort the sortedChar.
        java.util.Collections.sort(sortedChars);


        //Loop through sortedChar add check each character in HashMap to return
        //character count
        for(char letter : sortedChars) {
            int letterCount = charCount.get(letter);
            //make character count to % using total character count of textFile
            // = file size
            double pct = (letterCount * 100) / fileSize;
            System.out.println(letter + " = "+pct +"%");
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
        //Call the calculate method from main and print the distribution.
        File textF = new File("/Users/Hoshiko/Desktop/accesscode/HW_04-03/myWords.txt");
        calculate(textF);
    }


}
