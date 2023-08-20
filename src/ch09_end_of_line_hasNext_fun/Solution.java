package ch09_end_of_line_hasNext_fun;

import java.util.Scanner;

/*
* The challenge here is to read lines of input until you reach EOF, then number and print all
lines of content.
Hint: Java's Scanner.hasNext() method is helpful for this problem.*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        for(int i=1; scan.hasNext();i++){
            System.out.println(i+" "+scan.nextLine());
        }
        scan.close();
    }
}
