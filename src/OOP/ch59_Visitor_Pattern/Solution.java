package OOP.ch59_Visitor_Pattern;

import java.util.*;





public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);

        ArrayList<Tree> nodes = new ArrayList<>();

        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            nodes.add(new Tree());
            nodes.get(i).setValue(sc.nextInt());
        }
        for (int i=0;i<n;i++){
            nodes.get(i).setColor(sc.nextInt());
        }

        for (int i=1;i<n;i++){
            nodes.get(i).setNodeIndexingU(sc.nextInt());
            nodes.get(i).setParentIndexV(sc.nextInt());
        }

        for (int i=0;i<n;i++){
            System.out.print(nodes.get(i).getValue()+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++) {
            System.out.print(nodes.get(i).getColor() + " ");
        }
    }
}









/*

Sample Input

5
4 7 2 5 12
0 1 0 0 1
1 2
1 3
3 4
3 5

Sample Output

24
40
15
*/
