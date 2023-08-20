package OOP.ch60_annotation.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//setting the bounder/validation for using this annotation
//Type->Class
//Method->method of the class
@Target({ElementType.TYPE, ElementType.METHOD})
//execute in Runtime
//RetentionPolicy.SOURCE for before compiling
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {

}
