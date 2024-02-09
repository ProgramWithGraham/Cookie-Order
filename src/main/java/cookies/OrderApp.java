package cookies;

import java.util.Scanner;

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

        CookieOrder krisOrder = new CookieOrder("Thin Mints", 3);
        CookieOrder donaldOrder = new CookieOrder("Tagalongs", 10);
        CookieOrder adrianOrder = new CookieOrder("Thin Mints", 15);

        MasterOrder beckyOrderSheet = new MasterOrder();

        beckyOrderSheet.addOrder(krisOrder);
        beckyOrderSheet.addOrder(donaldOrder);
        beckyOrderSheet.addOrder(adrianOrder);

        System.out.println("Current Order");
        System.out.println(beckyOrderSheet.getOrders());
        System.out.println(beckyOrderSheet.getTotalBoxes());
        // System.out.println(beckyOrderSheet.getVarietyBoxes());

        yummy.close();

    }
}