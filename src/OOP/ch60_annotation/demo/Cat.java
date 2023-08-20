package OOP.ch60_annotation.demo;

//apply of the annotation
@CustomAnnotation
public class Cat {
    //field of a class
    @AnnotationForField
    String name;
    int age;

    //constructor
    public Cat(String name) {
        this.name = name;
    }

    //methods
    @RunImmediately(times=3)
    public void meow(){
        System.out.println("Meow!");
    }

    public void eat(){
        System.out.println("Munch");
    }
}
