package OOP.ch62_Lambda.demo;


public class Cat implements LambdaInterface{

    String name;
    int age;

    //constructor
    public Cat(String name) {
        this.name = name;
    }

    //methods
    public void meow(){
        System.out.println("Meow!");
    }

    public void eat(){
        System.out.println("Munch");
    }

    @Override
    public void print(String s){
        System.out.println("Meow!!");
    }
}
