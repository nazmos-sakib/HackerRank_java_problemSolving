package OOP.ch58_Singleton_pattern;


class Singleton{
    public String str;
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getSingleInstance(){
        if (null==instance){
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    public void print(){
        System.out.println("this is a print function");
    }
}