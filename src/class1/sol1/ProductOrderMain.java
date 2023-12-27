package class1.sol1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder pojo = new ProductOrder();
        pojo.productName="두부";
        pojo.price = 2000;
        pojo.quantity = 2;
        orders[0] = pojo;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        orders[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        orders[2] = coke;

        int sum = 0;

        for(ProductOrder productOrder: orders){
            sum += productOrder.quantity * productOrder.price;
            System.out.println("상품명: "+productOrder.productName + ", 가격: "+productOrder.price+", 수량: "+ productOrder.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
