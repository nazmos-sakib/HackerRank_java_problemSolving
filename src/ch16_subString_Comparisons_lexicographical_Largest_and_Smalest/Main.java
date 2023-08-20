package ch16_subString_Comparisons_lexicographical_Largest_and_Smalest;


import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzz";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int j = 0; j <=s.length()-k; j++) {
            String temp = s.substring(j,j+k);
            System.out.println(temp);

            //find smallest
            if(temp.compareTo(smallest)<0) {
                smallest = temp;
            }

            //find largest
            if(temp.compareTo(largest)>0) {
                largest = temp;
            }

        }


        System.out.println("------------");
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*Sample Input
Sample Input 0

welcometojava
3

Sample Output 0

ava
wel

Explanation 0

String
has the following lexicographically-ordered substrings of length k=3

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/