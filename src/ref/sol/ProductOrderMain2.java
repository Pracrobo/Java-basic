package ref.sol;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] order= new ProductOrder[3];
        order[0] = createOrder("두부", 2000, 2);
        order[1] = createOrder("김치", 5000, 1);
        order[2] = createOrder("콜라", 1500, 2);

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for(ProductOrder order:orders){
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for(ProductOrder order : orders) {
            total += order.price* order.quantity;
        }
        return total;
    }
}
