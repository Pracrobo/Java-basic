package poly.ex5;

public class Cat implements InterfaceAnimal{ // 인터페이스 구현 implements
    @Override
    public void sound() {
        System.out.println("냐-옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
