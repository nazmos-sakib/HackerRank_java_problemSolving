package DataStructure.ch40_Deque;


//  Unable to finish in 3 seconds and did not use Deque

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }
        in.close();

        int largeUniqueNumber = Integer.MIN_VALUE;

        for (int i = 0;i<n-m+1;i++){
            largeUniqueNumber = Math.max(largeUniqueNumber, helperFunctionWithHashSet(Arrays.copyOfRange(arr,i,i+m)));
        }

        System.out.println(largeUniqueNumber);

    }
    public static int helperFunctionWithHashSet(int[ ] temp){
        HashSet<Integer> unique = new HashSet<>();
        for (int j = 0; j < temp.length; j++) {
            unique.add(temp[j]);
        }
        return unique.size();
    }

    public static int helperFunctionWithHashMap(int[ ] temp){
        HashMap<Integer,Integer> unique  = new HashMap<>();
        for (int j = 0; j < temp.length; j++) {
            unique.put(temp[j], j);
        }
        return unique.size();
    }

    public static int helperFunctionWithStack(int[] temp){
        Stack<Integer > uniqueNumber = new Stack<>();
        //temp;
        uniqueNumber.push(temp[0]);
        for (int i=1;i<temp.length;i++){
            if (!uniqueNumber.contains(temp[i])){
                uniqueNumber.push(temp[i]);
            }
        }
        return uniqueNumber.size();
    }
}

/*
6 3
5 3 5 2 3 2

 */


