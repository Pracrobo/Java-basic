package poly.sol.pay1;

public class DefaultPay implements  Pay{ //Null object Pattern
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false; //무조건 false
    }
}
