package ch10_Static_Initializer_Block;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new  Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        scan.close();

        if(B>0 && H>0){
            System.out.println(B*H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}

/*Sample input 1

1
3

Sample output 1

3

Sample input 2

-1
2

Sample output 2

java.lang.Exception: Breadth and height must be positive
*/