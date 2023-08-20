package DataStructure.ch26_BigInteger_findPrime;


import java.io.*;
import java.math.*;

import static java.util.stream.Collectors.joining;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger b = new BigInteger(n );
        if(b.isProbablePrime(1)){
            System.out.println("prime");
        } else
            System.out.println("not prime");

    }
}


/*Sample Input

13

Sample Output

prime
*/