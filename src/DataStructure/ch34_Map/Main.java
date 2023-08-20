package DataStructure.ch34_Map;

//Complete this code or write your own from scratch
import java.util.*;

class Main {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> pnb = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();

            pnb.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (pnb.containsKey(s)){
                System.out.println(s+"="+pnb.get(s));
            } else System.out.println("Not found");

            /*Above code can be simplified with below
            String result = Optional.ofNullable(pnb.get(s))
                            .map(phone -> s + "=" + phone).orElse("Not found");
             */

        }
    }
}

/*
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

uncle sam=99912222
Not found
harry=12299933
 */


