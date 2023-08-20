package OOP.ch62_Lambda.racker_Rank_solution;

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd(){
        return (n)->{
            return n%2!=0;
        };
    }
    public PerformOperation isPrime(){
        return (n)->{

            for (int i = 2; i <= n / 2; ++i) {
                // condition for nonprime number
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }
    public PerformOperation isPalindrome(){
        return (n)->{

            int r,sum=0,temp;
            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            return temp==sum;
        };
    }
}


public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

/*

5
1 4
2 5
3 898
1 3
2 12

Sample Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE

 */
