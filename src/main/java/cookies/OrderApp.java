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
        CookieOrder chrisOrder = new CookieOrder("Samoas", 100);

        MasterOrder beckyOrderSheet = new MasterOrder();

        beckyOrderSheet.addOrder(krisOrder);
        beckyOrderSheet.addOrder(donaldOrder);
        beckyOrderSheet.addOrder(adrianOrder);
        beckyOrderSheet.addOrder(chrisOrder);

        System.out.println("Current Order");
        beckyOrderSheet.showOrder();
        System.out.println(" You have ordered " + beckyOrderSheet.getTotalBoxes() + " boxes");
        System.out.println("\n What would you like to remove? ( Please specify cookie name or state 'none')");

        String varietyToRemove = yummy.nextLine();

        System.out.println(
                " You have removed " + beckyOrderSheet.getVarietyBoxes(varietyToRemove) + " " + varietyToRemove);
        beckyOrderSheet.removeVariety(varietyToRemove);
        System.out.println("Current Order");
        beckyOrderSheet.showOrder();
        System.out.println(" You have ordered " + beckyOrderSheet.getTotalBoxes() + " boxes");

        yummy.close();

    }
}