package DataStructure.ch41_BitSet_logicGate_implementation;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();


        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);


        while(m-->0){
            String ops = sc.next();
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            if (ops.equals("AND")){

                if (value1==1){
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
            }

            if (ops.equals("OR")){
                if (value1==1){
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
            }

            if (ops.equals("XOR")){
                if (value1==1){
                    b1.xor(b2);
                } else {
                    b2.xor(b1);
                }
            }

            if (ops.equals("FLIP")){
                if (value1==1){
                    b1.flip(value2);
                } else {
                    b2.flip(value2);
                }
            }

            if (ops.equals("SET")){
                if (value1==1){
                    b1.set(value2);
                } else {
                    b2.set(value2);
                }
            }

            System.out.println(b1.cardinality() +" " + b2.cardinality());
        }
    }

}
/*

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

 */