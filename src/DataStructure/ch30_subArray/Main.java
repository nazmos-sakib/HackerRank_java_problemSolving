package DataStructure.ch30_subArray;

import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        sc.close();


        int sumOfNegativeSum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int[] subArray = Arrays.copyOfRange(array, i, j+1);
                int negativeSum = 0;
                for (int k=0;k<subArray.length;k++){
                    negativeSum += subArray[k];
                    System.out.printf("%d ",subArray[k]);
                }
                System.out.println(" := "+negativeSum);
                if (negativeSum<0) sumOfNegativeSum++;
            }
        }
        System.out.println("sum of negative sum: "+sumOfNegativeSum);

    }
}