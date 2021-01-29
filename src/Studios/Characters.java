package Studios;
import java.io.*;
import java.util.*;


public class Characters {
    public static void main(String[] args) {
        //String value = "Hello World";
        Scanner in=new Scanner(System.in); //created Scanner class
        System.out.println("Enter the String"); //Requested input from user
        String value=in.nextLine(); //method Reads a int value from user
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charactersInString = value.toLowerCase(Locale.ROOT).toCharArray(); //make the character counts case-insensitive
        for (char c : charactersInString) {
            if (charMap.containsKey(c)) {

                charMap.put(c, charMap.get(c) + 1);
            } else {

                charMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> val : charMap.entrySet()) {
            System.out.println(val.getKey() + " :" + val.getValue() );
            //sum += student.getValue();
        }
    }
}