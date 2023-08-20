package OOP.ch61_covariant_Return_type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String name;
    public String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    String name;
    Jasmine(String s){
        this.name = s;
    }
    @Override
    public String whatsYourName(){
        return name;
    }
}

class Lily extends Flower{
    String name;
    Lily(String s){
        this.name = s;
    }
    @Override
    public String whatsYourName(){
        return name;
    }
}

class Region {
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    public Flower yourNationalFlower(){
        return new Jasmine("Jasmine");
    }
}

class AndhraPradesh extends Region{
    @Override
    public Flower yourNationalFlower(){
        return new Lily("Lily");
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

/*Sample Input 0

AndhraPradesh

Sample Output 0

Lily

*/