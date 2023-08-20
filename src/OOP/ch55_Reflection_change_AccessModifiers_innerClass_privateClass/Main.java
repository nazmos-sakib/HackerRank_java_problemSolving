package OOP.ch55_Reflection_change_AccessModifiers_innerClass_privateClass;

import java.io.*;
import java.lang.reflect.*;
import java.security.*;


public class Main {

    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here
            Inner in = new Inner();
            o = null;

            /*
            in this approach changing the access modifier if the Private class.
            then invoke power2 function
             */

            Class[] classes = in.getClass().getDeclaredClasses();
            for (Class c: classes){
                if (c.getCanonicalName().equals("Easy.ch53_change_AccessModifiers_Reflection_innerClass_privateClass.Main.Inner.Private")){
                    for (Constructor ct: c.getDeclaredConstructors()){
                        if (ct.getName().equals("Easy.ch53_change_AccessModifiers_Reflection_innerClass_privateClass.Main$Inner$Private")){
                            ct.setAccessible(true); //changing access
                            o = ct.newInstance(in); //re-creating new instance with changing modifier
                        }
                    }//end of for constructor
                }
            } //end of for class

            Method[] ms = o.getClass().getDeclaredMethods(); //using newly modified object to get all the declared method.
            for (Method m : ms){
                if (m.getName().equals("powerof2")){
                    m.setAccessible(true);
                    System.out.println(num+" is "+m.invoke(o,num));
                }
                //System.out.println(m.getName());
            }//end of for


            /*
            however, without changing the modifier it is possible to invoke "powerof2"
            i dont know how it is possible


            Inner in = new Inner();
            o = in.new Private();
            Method[] a = o.getClass().getDeclaredMethods();
            for (Method m: a){
                if(m.getName().equals("powerof2")){
                    m.setAccessible(true);
                    System.out.println(num+" is "+m.invoke(o, num));
                }
            }
             */

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution
/*
When a program tries to stop the JVM by calling System.exit(...),
then it first checks if this action is allowed by asking the security manager if the exitVM permission is granted.

The code you posted replaces the security manager with a custom security manager that will throw an ExitTrappedException
when checking for the exitVM permission
 */
class DoNotTerminate { //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}




/*
Sample Input
8

Sample Output
8 is power of 2
An instance of class: Solution.Inner.Private has been created

 */