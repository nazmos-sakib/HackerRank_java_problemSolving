package ch14_Strings_Introduction_lexicographically;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());

        if(A.compareTo(B)>0) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(A+" "+B);

    }
}

/*Sample Input 0

hello
java

Sample Output 0

9
No
Hello Java

*/
