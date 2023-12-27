package ref;

public class MethodChange2 {
    public static void main(String[] args) {//참조값 복사 전달
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA = " + dataA.value);
        changeReference(dataA);
        System.out.println("dataA = " + dataA.value);
    }

    static void changeReference(Data dataB) {
        dataB.value = 20;
    }
}

