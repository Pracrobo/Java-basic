package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; //업캐스팅은 생략
        Parent parent2 = (Parent) child; //원래는 캐스팅해줘야함(Parent) 업캐스팅은 생략)

        parent1.parentMethod();
        parent2.parentMethod();

    }

}
