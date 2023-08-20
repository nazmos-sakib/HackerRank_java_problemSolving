package OOP.ch62_Lambda.demo;

public class Lambdas {
    public static void main(String[] args){
        Cat cat = new Cat("Tom");
        cat.print("s");

        printMeow(cat); //this is the same equivalent to  "cat.print();"

        //to achieve this Cat class have to implement LambdaInterface.
        //but the goat is to without implementing an interface getting the result.
        //solution the passing the implemented method as parameter

        printMeow(
                (s)->{
                    System.out.println("Meow from lambda"+s);
                }
        );

    }

    public static void printMeow(LambdaInterface inf){
        inf.print("@");
    }
}
