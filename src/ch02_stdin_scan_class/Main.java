package ch02_stdin_scan_class;

import java.util.Scanner;




/*
Task
        In this challenge, you must read 3 integers from stdin and then print
        them to stdout. Each integer must be printed on a new line.
        To make the problem a little easier,
        a portion of the code is provided for you in the editor below.

        Sample Input:
            42
            100
            125

        Sample Output
            42
            100
            125


*/

public class Main {
    public static void main(String[] args) {
        System.out.println("challenge 2");

        Scanner scan = new Scanner(System.in);
        String myString = scan.next();
        int a = scan.nextInt();
        scan.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + a);

    }
}
