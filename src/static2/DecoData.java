package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public void instaticCall() {
        staticValue++;
        staticMethod();
        //instanceValue++ >> 인스턴스 변수, compile error
        //instanceMethod(); >> 인스턴스 메서드,  compile error
    }

    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
