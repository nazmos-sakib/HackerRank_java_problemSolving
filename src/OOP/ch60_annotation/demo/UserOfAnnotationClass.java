package OOP.ch60_annotation.demo;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserOfAnnotationClass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        @SuppressWarnings("unused")
        int a;

        Cat cat = new Cat("Tom");

        //using of annotation to get desire result

        //check if a class is annotated with the annotation
        if (cat.getClass().isAnnotationPresent(CustomAnnotation.class)){
            System.out.println("Cat class is annotated with CustomAnnotation");
        }

        //checking annotation declaration in method
        for (Method method : cat.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(RunImmediately.class)){  //check if an annotation is present
                //if present check for annotation parameter
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i =0; i< annotation.times();i++){
                    //invoking the method
                    method.invoke(cat);
                }

            }
        }

        //checking for field annotation
        for (Field field:cat.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(AnnotationForField.class)){
                Object objValue = field.get(cat); //as the type of the field is unknown
                //check if its a string value
                if (objValue instanceof String ){
                    System.out.println("Name of the cat is "+objValue);
                }
            }
        }

    }
}

