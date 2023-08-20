package OOP.ch54_Reflection.exercise;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void meow(){
        System.out.println("Meow");
    }

    private void heyThisIsPrivate(){
        System.out.println("How did you call this function");
    }

    public static void thisIsAPublicStaticMethod(){
        System.out.println("I am public and static!");
    }

    private static void thisIsAPrivateStaticMethod(){
        System.out.println("Hey , i am private and static!");
    }
}


