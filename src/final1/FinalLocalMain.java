package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
       // data1 = 20; java: variable data1 might already have been assigned

        final int data2 =10;
        method(10);

    }

    static void method (final int parameter) {
     //   parameter = 20; >>java: final parameter parameter may not be assigned
    }
}
