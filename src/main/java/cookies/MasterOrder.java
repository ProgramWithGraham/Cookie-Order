package cookies;

// treat like Employee java but for cookies with Arrays
/*
 * Declare your ArrayList and name it orders
* MAYBE - Create an empty constructor and the following methods
public void addOrder(CookieOrder theOrder) add an order to the list showing variety and quantity
 * DONE - public int getTotalBoxes() keep track of total boxes ordered
public void removeVariety(String variety) give the ability to pick out a variety of cookies and 
remove it from the list. Hint: When you remove something the list will shrink, 
you need to consider this when traversing your collection (you don't want to overlook any items)
* MAYBE - public int getVarietyBoxes(String variety) returns the total boxes of a given variety.
public void showOrder() to traverse and print the ArrayList
 */
public abstract class MasterOrder {
    int totalBoxes;
    int numBoxes;
    int varietyBoxes;
    String variety;

    public MasterOrder(int totalBoxes, int varietyBoxes, String variety) {
        this.totalBoxes = totalBoxes;
        this.varietyBoxes = varietyBoxes;
        this.variety = variety;
        this.numBoxes = numBoxes;

    }

    // public String getVariety() {
    // return this.variety;
    // }

    // public void setVariety(String variety) {
    // this.variety = variety;
    // }

    public int getTotalBoxes() {
        return this.totalBoxes;
    }

    public void setTotalBoxes(int totalBoxes) {
        this.totalBoxes = totalBoxes;
    }

    public int getVarietyBoxes() {
        return this.varietyBoxes;
    }

    public void setVarietyBoxes(int varietyBoxes) {
        this.varietyBoxes = varietyBoxes;
    }

    public void showOrder(String cookieFlavors) {

    }

    @Override
    public String toString() {
        return "MasterOrder [totalBoxes=" + totalBoxes + ", varietyBoxes=" + varietyBoxes
                + "]";
    }

    public abstract String cookies();
}
