package ch03_conditional_statements;

import java.util.Scanner;

/*
Task
        Given an integer, n
        , perform the following conditional actions:

        If n is odd, print Weird
        If n is even and n in the inclusive range of  2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird

        Complete the stub code provided in your editor to print whether
        is weird.

 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Hacker Rank challenge No: 3");
        int n = scanner.nextInt();
        //newline characters like \r\n, \n, \r, \u2028, \u2029, and \u0085) present in the input stream.
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(n%2==0){
            if(n>=6 && n<=20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("Weird");
        }
    }
}


/*
*
Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird
*/