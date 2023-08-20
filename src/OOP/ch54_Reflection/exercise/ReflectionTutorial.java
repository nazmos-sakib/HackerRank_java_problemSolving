package OOP.ch54_Reflection.exercise;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial  {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Stella", 2);

        //get declared variables
        Field[] catField = myCat.getClass().getDeclaredFields();

        //print declared variables
        for (Field f: catField){
            System.out.println(f.getName());
        }
        System.out.println(myCat.getName()); //before changing the name
        //
        for (Field f: catField){
            if (f.getName().equals("name")){ //access name variable
                f.setAccessible(true);      // name variable is stated as fina. need to change access to change its value
                f.set(myCat,"Jimmy McGill");   //setting new name for myCat object
            }
        }
        System.out.println(myCat.getName()); // after changing the name



        //get declared methods of Cat class.
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        //print declared methods
        for (Method m: catMethods){
            System.out.println(m.getName());
        }

        //triggering meow method by reflection
        for (Method m: catMethods){
            if(m.getName().equals("meow")){
                m.setAccessible(true);
                m.invoke(myCat); //parameter are pass after writing object name
            }
        }


        //triggering private method by reflection
        for (Method m: catMethods){
            if(m.getName().equals("heyThisIsPrivate")){
                //myCat.heyThisIsPrivate(); //it is not possible to call a private method.
                m.setAccessible(true);
                m.invoke(myCat); //parameter are pass after writing object name
            }
        }

        //triggering static public method by reflection
        for (Method m: catMethods){
            if(m.getName().equals("thisIsAPublicStaticMethod")){
                //m.setAccessible(true);
                m.invoke(null); //as static methods are call by class name rather than object name.
            }
        }

        //triggering static private method by reflection
        for (Method m: catMethods){
            if(m.getName().equals("thisIsAPrivateStaticMethod")){
                m.setAccessible(true);
                m.invoke(null); //as static methods are call by class name rather than object name.
            }
        }



    }//end of main
}
