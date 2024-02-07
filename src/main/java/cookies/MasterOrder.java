package cookies;

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
public abstract class MasterOrder {
    String variety;
    int varietyBoxes;
    int totalBoxes;

    public MasterOrder(String variety, int varietyBoxes, int totalBoxes) {
        this.variety = variety;
        this.varietyBoxes = varietyBoxes;
        this.totalBoxes = totalBoxes;
        // this.numBoxes1 = numBoxes1;

    }

    public void addOrder(CookieOrder theOrder) {
    }

    public String getVariety() {
        return this.variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getTotalBoxes() {
        return this.totalBoxes;
    }

    public void setTotalBoxes(int totalBoxes) {
        this.totalBoxes = totalBoxes;
    }

    public int getVarietyBoxes(String variety) {
        return this.varietyBoxes;
    }

    public void setVarietyBoxes(int varietyBoxes) {
        this.varietyBoxes = varietyBoxes;
    }

    public void showOrder() {

    }

    public void removeVariety(String variety) {
        this.variety = variety;

    }

    @Override
    public String toString() {
        return "MasterOrder [totalBoxes=" + totalBoxes + ", varietyBoxes=" + varietyBoxes
                + "]";
    }

    // public abstract String CookieOrder();
}
