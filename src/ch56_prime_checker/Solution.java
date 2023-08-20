package ch56_prime_checker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Prime p = new Prime();

        int n1=Integer.parseInt(br.readLine().trim());
        int n2=Integer.parseInt(br.readLine().trim());
        int n3=Integer.parseInt(br.readLine().trim());
        int n4=Integer.parseInt(br.readLine().trim());
        int n5=Integer.parseInt(br.readLine().trim());


        p.checkPrime(n1);
        p.checkPrime(n1,n2);
        p.checkPrime(n1,n2,n3);
        p.checkPrime(n1,n2,n3,n4,n5);



        br.close();
    }

}


class Prime{
    public void checkPrime(Integer... a){
        for (int i=0;i<a.length;i++){
            if (chP(a[i])){
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
        System.out.println("");

    }

    public boolean chP(int n){
        if (n<=1){
            return false;
        } else if (n==2){
            return true;
        } else if (n%2==0){
            return false;
        } else {
            int upperBound = (int) Math.sqrt(n);
            for (int i = 3;i<=upperBound;i=+2){
                if (n%i==0)
                    return false;
            }
            return true;
        }
    }
}

/*

Sample Input

2
1
3
4
5

Sample Output

2
2
2 3
2 3 5
*/
