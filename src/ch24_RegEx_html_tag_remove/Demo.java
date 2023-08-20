package ch24_RegEx_html_tag_remove;


import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            searchPattern(input);
        }

        in.close();
    }

    static void searchPattern(String s){
        boolean foundStartingTag_firstChar = false;
        boolean foundStartingTag_lastChar = false;
        boolean foundEndTag_firstChar = false;
        boolean foundEndTag_lastChar = false;

        int indexStartingTag_firstChar = -1;
        int indexStartingTag_lastChar = -1;
        int indexEndTag_firstChar = -1;
        int indexEndTag_lastChar = -1;
        for(int i=0;i<s.length()-1;i++){
            //finding starting tag

            if(s.charAt(i)=='<' && s.charAt(i+1)!='/'){
                indexStartingTag_firstChar = i;
                foundStartingTag_firstChar = true;
            }
            if(s.charAt(i)=='>' && foundStartingTag_firstChar && !foundEndTag_firstChar){
                indexStartingTag_lastChar = i;
                foundStartingTag_lastChar = true;
                //break;
            }

            //finding ending tag
            if(s.charAt(i)=='<' && s.charAt(i+1)=='/' ){
                indexEndTag_firstChar = i;
                foundEndTag_firstChar = true;
            }
            if(s.charAt(i+1)=='>' && foundEndTag_firstChar){
                indexEndTag_lastChar = i+1;
                foundEndTag_lastChar = true;
                break;
            }

        }
        if (foundStartingTag_firstChar && foundStartingTag_lastChar && foundEndTag_firstChar && foundEndTag_lastChar){
            String starting_tag = s.substring(indexStartingTag_firstChar + 1, indexStartingTag_lastChar);
            String end_tag = s.substring(indexEndTag_firstChar + 2, indexEndTag_lastChar);


            if (starting_tag.equals(end_tag)){

                System.out.println(s.substring(indexStartingTag_lastChar + 1, indexEndTag_firstChar));
            } else {
                System.out.println("None");
            }
        } else {
            System.out.println("None");
        }
    }
}

