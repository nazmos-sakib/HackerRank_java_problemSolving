package ch64_SHA256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

//MD5 (Message-Digest algorithm 5) cryptographic hash function
public class Main {
    public static void main(String args[]) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        if (s.length()>5){
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            final byte[] result = digest.digest(
                    s.getBytes(StandardCharsets.UTF_8));

            //converting byte array into signum representation
            BigInteger no = new BigInteger(1, result);
            //converting message digest into hex value
            String hashText = no.toString(16);
            while (hashText.length() < 64)
            {
                hashText = "0" + hashText;
            }

            System.out.println(hashText);
        }

    }
}
/*
Sample Input 0
HelloWorld

Sample Output 0
872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4

Sample Input 1
Javarmi123

Sample Output 1
f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678
*/
