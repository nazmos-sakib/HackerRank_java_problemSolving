package ch17_String_Reverse_palindrome;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        /* Enter your code here. Print output to STDOUT. */
        int flag = 0;
        for(int i=0,j=A.length();i<A.length()/2;i++,j--){
            if(A.substring(i,i+1).compareTo(A.substring(j-1,j))!=0){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



/*Sample Input

madam

Sample Output

Yes
*/