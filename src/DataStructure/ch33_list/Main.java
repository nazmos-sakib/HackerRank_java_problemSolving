package DataStructure.ch33_list;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int q1 = sc.nextInt();
        while (q1-- >0){
            String q2= sc.next();
            if (q2.equals("Insert")){
                //System.out.println("Insert");
                int index = sc.nextInt();
                int value = sc.nextInt();
                //System.out.println(index+" "+value);

                if (index<list.size()){
                    list.add(index,value);
                } else
                    list.add(value);

            }
            else if (q2.equals("Delete")){
                //System.out.println("Delete");
                int index = sc.nextInt();
                //System.out.println(index);

                if (index>=0 && index<list.size()) list.remove(index);
            }
        }
        for (int i: list){
            System.out.print(i+" ");
        }
    }
}

/*
5
12 0 1 78 12
2
Insert
5 23
Delete
0

---second test case
0     1     2       3     4     5    6      7    8      9   10
11
27358 39344 71551 99795 97548 77891 28014 1546 24269 38550 23153
10
Insert
3 15097
Delete
0
Insert
1 25282
Insert
7 13736
Insert
10 50299
Delete
11
Insert
5 13902
Insert
2 58695
Insert
9 44009
Delete
11

 */