package cookies;

// treat like doctor towards MasterOrder
public class CookieOrder {
    String varietyOfCookie;
    int numBoxes;

    public CookieOrder(String varietyOfCookie, int numBoxes) {
        this.varietyOfCookie = varietyOfCookie;
        this.numBoxes = numBoxes;

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
