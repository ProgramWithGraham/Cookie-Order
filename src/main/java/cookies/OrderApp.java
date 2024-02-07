package cookies;

import java.util.ArrayList;
import java.util.Scanner;

// treat like HospitalApp with Mclean and McDream that will feed into MasterORder and CookieOrder

/*
 * Add 4 orders
Total the boxes purchased
Show the list
Remove a variety and give feedback on how many boxes were removed
Show the updated list
 */
public class OrderApp {
    public static void main(String[] args) {
        Scanner yummy = new Scanner(System.in);
        ArrayList<String> orders = new ArrayList<String>();

        orders.add("Samoas");
        orders.add("Thin Mints");
        orders.add("Girl Scout S'mores");
        orders.add("Adventurefuls");
        System.out.println("Current Order");
        System.out.println("Variety: " + orders.get(0));
        System.out.println("Variety: " + orders.get(1));
        System.out.println("Variety: " + orders.get(2));
        System.out.println("Variety: " + orders.get(3));
        yummy.close();

        // CookieOrder orderNumberOne = new CookieOrder(null, 0, 0, null, 0);

        //
        //

    }
}