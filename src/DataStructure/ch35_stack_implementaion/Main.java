package DataStructure.ch35_stack_implementaion;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code

            System.out.println(calculate(input)? "true": "false");

        }

    }

    public static boolean calculate(String s){
        Stack<String > firstBracket = new Stack<>();
        Stack<String > secondBracket = new Stack<>();
        Stack<String > thirdBracket = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //Process char
            if (c=='('){
                firstBracket.push(""+c);
            }
            if (c==')') {
                if (!firstBracket.empty()) firstBracket.pop();
                else  return false;
            }

            if (c=='{'){
                secondBracket.push(""+c);
            }
            if (c=='}'){
                if (!secondBracket.empty()) secondBracket.pop();
                else return false;

            }
            if (c=='['){
                thirdBracket.push(""+c);
            }
            if (c==']'){
                if (!thirdBracket.empty()) thirdBracket.pop();
                else return false;
            }
        }

        if (firstBracket.empty() && secondBracket.empty() && thirdBracket.empty()) return true;
        else return false;


    }
}
/*
{}()
({()})
{}(
[]

 */