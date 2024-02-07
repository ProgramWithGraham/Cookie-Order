package cookies;

// treat like doctor towards MasterOrder
public abstract class CookieOrder extends MasterOrder {
    String varietyOfCookie;
    int numBoxes;

    public CookieOrder(int totalBoxes, String varietyOfCookie, int numBoxes) {
        super(totalBoxes);
        this.numBoxes = numBoxes;
        this.varietyOfCookie = varietyOfCookie;
    }

    public String getVarietyOfCookie() {
        return this.varietyOfCookie;
    }

    public void setVarietyOfCookie(String varietyOfCookie) {
        this.varietyOfCookie = varietyOfCookie;
    }

    public int getNumBoxes() {
        return this.numBoxes;
    }

    public void setNumBoxes(int numBoxes) {
        this.numBoxes = numBoxes;
    }
}
