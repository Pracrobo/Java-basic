package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //참조 대상의ㅏ 값은 변경 가능
        data.value = 10;
        System.out.println("data = " + data.value);
        data.value = 20;
        System.out.println("data = " + data.value);;
    }
}
