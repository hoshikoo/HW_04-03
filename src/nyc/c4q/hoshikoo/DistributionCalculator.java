package nyc.c4q.hoshikoo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

/**
 * Created by Hoshiko on 4/1/15.
 */
public class DistributionCalculator {

    public calculate (File textFile){

        //hashmap (k=chractor, v) for character
        HashMap<Character, Integer> charCount= new HashMap<Character, Integer>();
        ArrayList<Character> chars = new ArrayList<Character>();
        int value=0;
        //int totalChar = textFile.length();
        //textFile = textFile.toLowerCase();
        char letter;

        //for(Character letter:charCount){
        for(int i=0; i<textFile.length; i++){
            // it is already in the hashmap add 1 to the value,
            if(charCount.containsKey(letter)){
                charCount.put(letter,charCount.get(letter)+1);
            }else{
                // if there is not the charactor add.
                //list of character in hash set
                charCount.put(letter, 1);
                chars.add(letter);
            }

        }

        //array and sort it.  use .sort

        Collections.sort(chars);



        //thourgh the array and get value on hashMap

        //print the % of each character.

    }


    public static void main(String[] args) {
        File file = new File("");

    }
}
