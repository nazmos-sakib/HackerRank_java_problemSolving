package ch19_String_split;

import java.util.*;

public class GitSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        scan.close();

        String[] tokens = str.split("[^\\p{Alpha}]+");

        int length = (str.isEmpty()) ? 0 : tokens.length;
        System.out.println(length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

/*
* Sample Input

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