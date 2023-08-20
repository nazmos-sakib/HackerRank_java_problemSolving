package ch04_nextLine_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hacker Rank challenge No: 4");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        //String s = scan.next();
        scan.nextLine();
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


/*Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/