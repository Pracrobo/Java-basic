package poly.ex5;

public class Cow implements InterfaceAnimal{ // 인터페이스 구현 implements
    @Override
    public void sound() {
        System.out.println("음-메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
