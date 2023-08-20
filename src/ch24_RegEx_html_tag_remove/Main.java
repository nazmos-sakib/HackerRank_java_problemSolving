package ch24_RegEx_html_tag_remove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            //System.out.println(line);
            searchPattern(line);

            testCases--;
        }
    }
    static void searchPattern(String s) {
        //step1: if it contains only spatial character and no english letter
        //step2: separate element
        //step3: take three element together
        //      search for startTag string endTag pattern
        //          check for legit tag
        //          compare startTag & endTag if the tags are same
        //              when match
        //              get inside string
        //              check if anything between two tag is not empty and another tag



        //step1
        if (!containsLetter(s)){
            System.out.println("None");
            //System.out.println("----------------------");
            return;
        }

        String result = "";
        boolean isResultFound = false;

        //step2
        List<String> separatedElement = extractSpecialPatterns(s);

        //step3
        for (int i=0; i <separatedElement.size()-2;i++) {
            String startTag = separatedElement.get(i);
            String expectedResult = separatedElement.get(i + 1);
            String endTag = separatedElement.get(i + 2);


            //check if its a tag
            if (startTag.contains("<") && !startTag.contains("</") && endTag.contains("</")) {
                //System.out.println("check if its a tag");
                //check for legit tag
                if (isValidHTMLTag(startTag) && isValidHTMLTag(endTag)) {
                    //System.out.println("check for legit tag");
                    //compare tags
                    if (endTag.substring(2).equals(startTag.substring(1))) {
                        //System.out.println("compare tags");
                        //check desire string not empty
                        //its not another tag
                        if (!expectedResult.isEmpty() && !isATag(expectedResult)) {
                            //System.out.println("found result");
                            //found result
                            isResultFound = true;
                            System.out.println(expectedResult);;
                            //break;
                        }
                    }
                }


            }
        }
        if (!isResultFound){
            System.out.println("None");
        }


        //System.out.println("----------------------");

    }

    static void searchPattern_v1(String s) {
        //put tags in a stack
        //compare startTag & endTag
        //when match
        //      get inside string
        //      get index startTag and endTag


        Stack<String > firstBracket = new Stack<>();
        String result = "";
        String currentTag = "";

        boolean isResultFound = false;

        for (String ss: extractSpecialPatterns(s)){
            if (ss.contains("<") && !ss.contains("</")){
                currentTag = ss;
            } else if (ss.contains("</")){
                if (ss.substring(2).equals(currentTag.substring(1))) {
                    isResultFound = true;
                    break;
                }
            } else {
                result = ss;
            }

        }
        System.out.println((isResultFound && !result.isEmpty())?result:"None");
    }

    public static List<String> extractSpecialPatterns(String inputString) {
        List<String> patterns = new ArrayList<>();
        Pattern pattern = Pattern.compile("<[^>]*>|[^<]+");
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            patterns.add(matcher.group());
        }
        return patterns;
    }

    public static boolean containsLetter(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
    public static boolean isValidHTMLTag(String input) {
        /*if (
                //</>
                input.contains("</") && !(input.length()<4) ||
                        input.contains(containsLetter(input))
        ){
            return false;
        }*/
        return containsLetter(input);
    }

    public static boolean isATag(String s) {
        if ((s.contains("<") || s.contains("</")) && s.contains(">")) {
            return true;
        }
        return false;
    }
}

/*
* Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
*
*
*
10
<h1>some</h1>
<h1>had<h1>public</h1></h1>
<h1>had<h1>public</h1515></h1>
<h1><h1></h1></h1>
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
<>hello</>
<>hello</><h>dim</h>
<>hello</><h>dim</h>>>>>

output:
some
public
None
None
None
None
None
None
dim
dim
*/

