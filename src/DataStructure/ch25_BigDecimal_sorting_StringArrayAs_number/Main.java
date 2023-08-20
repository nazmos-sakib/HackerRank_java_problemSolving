package DataStructure.ch25_BigDecimal_sorting_StringArrayAs_number;

import java.math.BigDecimal;
import java.util.*;
class Main{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, 0, n, new Comparator<Object>() {
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String) a1);
                BigDecimal bigDec2 = new BigDecimal((String) a2);
                return bigDec2.compareTo(bigDec1);
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

/* input
9 //number of inputs
-100
50
0
56.6
90
0.12
.12
02.34
000.000
 */