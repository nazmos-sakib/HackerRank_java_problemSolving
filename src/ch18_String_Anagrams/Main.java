package ch18_String_Anagrams;

import java.util.Arrays;
import java.util.Scanner;

/*
Two strings, a and b , are called anagrams
        if they contain all the same characters in the same frequencies.
        For this challenge, the test is not case-sensitive. For example,
        the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

*/

public class Main {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean result = false;

        // check if length is same
        if(a.length() == b.length()) {

            // convert strings to char array
            char[] charArray1 = a.toCharArray();
            char[] charArray2 = b.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            result = Arrays.equals(charArray1, charArray2);

        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*Sample Input 0

anagram
margana

Sample Output 0

Anagrams

*/