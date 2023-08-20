import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {
    public static void main(String[] ags) {
        String orderName = "bjlLK";
        //String customerName = "James";
        String customerName = "Bill";

        //int difference = orderName.compareTo(customerName);
        int difference = customerName.compareToIgnoreCase(orderName);

        System.out.println("Difference: " + difference);
    }
}