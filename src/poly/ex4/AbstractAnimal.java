package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();

    public abstract void move();
    // 추상부모클래스(순수 추상 클래스) 만드는 이유
    //실행로직이 없고 다형성을 위한 부모역할 메서드만 가지고 있다
    // 타입을 모으고 자식으로 구현하는게 다형성을 목적으로 만들어짐
    // 인스턴스 생성할 수 없다
    // 자식은 모든 메서드 오버라이딩
    // 다형성을 위해 이용
    // 자바는 이걸 인터페이스란 용어로 대체해서 쓴다
    // 인터페이스
    // public abstract >> 생략 가능 void sound(), void move()
    // 다중 구현(다중 상속 _ 인터페이스) 지원, 인터페이스는 상속이라 안하고 구현이라고 한다.
    // 클래스 이름은 public interface 메서드명() {}
    //  public, static, final 사용안하고 무조건  : 상수, _
    //
}
