package access.sol;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter1 counter = new MaxCounter1(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println("count = " + count);
    }
}
