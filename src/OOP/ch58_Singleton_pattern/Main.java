package OOP.ch58_Singleton_pattern;

public class Main {
    public static void main(String args[]){
        Singleton sg = Singleton.getSingleInstance();
        sg.str="Hello singelton";
        Singleton sg2 = Singleton.getSingleInstance();
        System.out.println(sg2.str);

    }

    }
