package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Pig()};
// ctrl + alt + n :  refactoring
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }
    //ctrl + alt +  M : 메서드 추출
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}


