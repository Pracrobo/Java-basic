package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); // 기본생성자일 경우에만 super() 생량
        System.out.println("ClassC 생성자");
    }
}
