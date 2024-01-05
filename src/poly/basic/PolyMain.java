package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("chilld -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        //부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child11 = new Parent(); // 자식은 부모를  담을 수 없다.java: incompatible types: poly.basic.Parent cannot be converted to poly.basic.Child
        // poly.childMehod(); : cant find symbol


    }
}
