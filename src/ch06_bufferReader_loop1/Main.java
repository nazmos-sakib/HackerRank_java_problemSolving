package ch06_bufferReader_loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.stream.Collectors.joining;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hacker Rank challenge No: 6");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i=1;i<=N;i++){
            System.out.println(i+"X"+ N +"="+i*N);
        }
    }
}

/*Sample Input
2

Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/