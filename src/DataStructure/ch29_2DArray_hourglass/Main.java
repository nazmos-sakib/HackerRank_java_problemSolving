package DataStructure.ch29_2DArray_hourglass;


import java.io.*;
import java.util.*;
import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int sum =   Integer.MIN_VALUE;;
        int temp = 0;

        for(int i=0;i<arr.size()-2;i++){
            for(int j=0;j<arr.get(i).size()-2;j++){

                int a=arr.get(i).get(j);
                int b=arr.get(i).get(j+1);
                int c=arr.get(i).get(j+2);
                int d=arr.get(i+1).get(j+1);
                int e=arr.get(i+2).get(j);
                int f=arr.get(i+2).get(j+1);
                int g=arr.get(i+2).get(j+2);

                temp = a+b+c+d+e+f+g;

                System.out.println(temp);
                if(sum<temp){
                    sum = temp;
                    temp = 0;
                } else temp = 0;
            }



        }
        System.out.println(sum);
    }
}

/*
-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5

-6 ans
 */