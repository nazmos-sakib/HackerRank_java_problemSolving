package ch05_Output_Formatting_printf_function;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hacker Rank challenge No: 5");

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d%n",s1,x);
        }
        System.out.println("================================");
        sc.close();
    }
}

/*
* Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100
cpp            065
python         050
================================
*/