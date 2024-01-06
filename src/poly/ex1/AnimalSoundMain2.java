package poly.ex1;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

    //    Cow [] cowArr = {cow, cat, dog};
// 타입이 달라서 넣을 수가 없다.
        soundCow(cow);

    }

    private static void soundCow(Cow cow) {
        System.out.println("동물소리 시작");
        cow.sound();
        System.out.println("동물소리 종료");

    }
}
