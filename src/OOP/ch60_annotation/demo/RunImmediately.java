package OOP.ch60_annotation.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//setting the bounder/validation for using this annotation
//Type->Class
//Method->method of the class
@Target({ElementType.METHOD})
//execute in Runtime
//RetentionPolicy.SOURCE for before compiling
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {
    //setting a parameter
    //only primitive and string type
    int times() default  1; //better to set a default value
}
