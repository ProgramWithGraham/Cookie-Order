package cookies;

// treat like doctor towards MasterOrder
public abstract class CookieOrder extends MasterOrder {
    // 2 instances of data, variety ( use this name) of cookies and
    // numBoxes (use this name) purchased
    // Create the constructor to handle this data and 2 accessor methods (get/set)

public cookieOrder(int totalBoxes, int varietyBoxes, String variety){
    super(totalBoxes, varietyBoxes, variety);

}

    @Override
    public abstract String cookies(){
        
    }

}
