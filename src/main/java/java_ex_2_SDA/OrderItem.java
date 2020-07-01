package java_ex_2_SDA;

public class OrderItem {
    private String productsName;
    private int quantity;
    private int unitPrice;

    public OrderItem(String productsName, int quantity, int unitPrice) {
        this.productsName = productsName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getValue (int quantity, int unitPrice){
        return quantity*unitPrice;
    }

    public boolean isCorrect (int quantity, int unitPrice){
        if (quantity>0 && unitPrice>0) return true;
        else return false ;
    }

    public void printOrder (String productsName, int quantity, int unitPrice){
        int value = getValue(quantity, unitPrice);
        System.out.println(productsName + unitPrice + " zł " + quantity + " szt " + value + " zł");
    }
}
