package ch20_RegEx_Pattern_check;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code

            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }
}

/*Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output

Valid
Invalid
Invalid
*/


