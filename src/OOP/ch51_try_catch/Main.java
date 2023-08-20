package OOP.ch51_try_catch;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        } catch(InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch(Exception e){
            System.out.println(e.getClass().getName());
        }
    }
}
