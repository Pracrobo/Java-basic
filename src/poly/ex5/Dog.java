package poly.ex5;

public class Dog implements InterfaceAnimal{ // 인터페이스 구현 implements
    @Override
    public void sound() {
        System.out.println("멍-멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
