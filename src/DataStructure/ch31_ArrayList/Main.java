package DataStructure.ch31_ArrayList;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> array = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tempN = sc.nextInt();
            List<Integer> tempArr = new ArrayList<>();
            for(int j=0;j<tempN;j++){
                tempArr.add(sc.nextInt());
            }
            array.add(tempArr);
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            try{
                System.out.println(array.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}

/*
Sample Input

5
5 41 77 74 22 44  //first number array size
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5


Sample Output

74
52
37
ERROR!
ERROR!

 */