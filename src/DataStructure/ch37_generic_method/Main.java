package DataStructure.ch37_generic_method;

public class Main {
    // generic method printArray
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Integer[] in = {1,2,3};
        String [] s = {"Hello", "World"};
        printArray(in);
        printArray(s);

    }
}

/*
1
2
3
Hello
World
 */