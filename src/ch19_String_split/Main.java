package ch19_String_split;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        ArrayList<String> arrayList = new ArrayList();
        //String[] sSplit = s.split(" |\\W");
        String[] sSplit = s.split("[! ,?._'@]");

        /*//other
        System.out.println(sSplit.length);
        for(String split: sSplit){
            System.out.println(split);
        }*/

        //extra code
        //it was necessary as an empty element was in the split array.
        for(String split: sSplit){
            if (!split.isEmpty())
                arrayList.add(split);
        }

        System.out.println(arrayList.size());
        for (String as: arrayList){
            System.out.println(as);
        }
    }
}

/*

Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he

 */