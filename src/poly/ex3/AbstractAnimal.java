package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); // 추상메서드가 있으면 추상 클래스로 만들어줘야 된다.
    // 상속받는 자식클래스를 만들면 오버라이딩해야 된다.
    // body 못만듦
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
