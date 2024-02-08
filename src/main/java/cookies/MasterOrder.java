package cookies;

import java.util.ArrayList;

/*
 *Declare your ArrayList and name it orders
*Create an empty constructor and the following methods
public void addOrder(CookieOrder theOrder) add an order to the list showing variety and quantity
 * DONE - public int getTotalBoxes() keep track of total boxes ordered
public void removeVariety(String variety) give the ability to pick out a variety of cookies and 
remove it from the list. Hint: When you remove something the list will shrink, 
you need to consider this when traversing your collection (you don't want to overlook any items)
* DONE!- public int getVarietyBoxes(String variety) returns the total boxes of a given variety.
public void showOrder() to traverse and print the ArrayList
 */
public class MasterOrder {

    ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();

    public ArrayList<CookieOrder> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<CookieOrder> orders) {
        this.orders = orders;
    }

    public MasterOrder() {

    }

    public void addOrder(CookieOrder theOrder) {
        this.orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int totalBoxesSold = 0;
        for (int orderIncrementor = 0; orderIncrementor < orders.size(); orderIncrementor++) {
            CookieOrder orderAtThisIndex = orders.get(orderIncrementor);
            totalBoxesSold += orderAtThisIndex.getNumBoxes();
        }
        return totalBoxesSold;
    }

    public void showOrder() {

    }

    // @Override
    // public String toString()
    // }

    // public abstract String CookieOrder();
}
