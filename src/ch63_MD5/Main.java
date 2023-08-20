package ch63_MD5;

import java.math.BigInteger;
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
            MessageDigest md = MessageDigest.getInstance("MD5");
            //calculating message digest of an input that return array of byte
            byte[] result = md.digest(s.getBytes());
            //converting byte array into signum representation
            BigInteger no = new BigInteger(1, result);
            //converting message digest into hex value
            String hashText = no.toString(16);
            while (hashText.length() < 32)
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

        68e109f0f40ca72a15e05cc22786f8e6

        Sample Input 1

        Javarmi123

        Sample Output 1

        2da2d1e0ce7b4951a858ed2d547ef485
*/
