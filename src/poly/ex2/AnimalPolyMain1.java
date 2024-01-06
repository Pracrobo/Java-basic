package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Animal dog =
        Cat cat = new Cat(); // Animal cat =
        Cow cow = new Cow(); // Animal cow =
        soundAnimal(dog); // 부모와 지식이 있어도 오버라이딩 먼저 호출
        soundAnimal(cat);
        soundAnimal(cow);

    }

    public static void soundAnimal(Animal animal){ //animal매개변수는 다형성 참조의 핵심
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }
}


