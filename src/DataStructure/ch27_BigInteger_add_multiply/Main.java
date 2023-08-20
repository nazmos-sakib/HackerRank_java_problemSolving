package DataStructure.ch27_BigInteger_add_multiply;


import java.util.*;
        import java.math.BigInteger;

        /*add and multiply huge numbers!
        These numbers are so big that you can't contain
        them in any ordinary data types like a long integer.*/

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new  Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        BigInteger C = A.add(B);
        BigInteger mul = A.multiply(B);
        System.out.println(C);
        System.out.println(mul);
    }
}

/*Sample Input

1234
20

Sample Output

1254
24680
*/