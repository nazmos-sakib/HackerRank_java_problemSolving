package ch07_serise_generate_loop2;

import java.util.Scanner;

/*You are given q queries in the form of a,b , and n.
 For each query, print the series corresponding to the given a,b , and n values
  as a single line of n space-separated integers.*/

public class Main {
    public static void main(String []argh){
        System.out.println("Hacker Rank challenge No: 7");

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=1;j<=n;j++){
                System.out.print(a+ calculateMidValue(j,b) + " ");
            }
            System.out.println("");
        }
        in.close();
    }
    public static int calculateMidValue(int m, int b){
        int sum = 0;
        for (int i=0;i<m;i++){
            sum += Math.round(Math.pow(2,i))*b;
        }
        return sum;
    }
}

/*Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
