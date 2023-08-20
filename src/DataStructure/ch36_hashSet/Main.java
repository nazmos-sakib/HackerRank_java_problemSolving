package DataStructure.ch36_hashSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> pair = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String s1 = pair_left[i] + " " + pair_right[i];

            /* no need for conditional check. if value is already in the set it will not add them.
            if(!pair.contains( pair_left[i]+" "+pair_right[i])){
                pair.add(pair_left[i]+" "+pair_right[i]);
            }
             */


            pair.add(s1);
            System.out.println(pair.size());
        }

//Write your code here

    }
}
/*
5
john tom
john mary
john tom
mary anna
mary anna

 */