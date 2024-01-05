package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();

        //다운 캐스팅(부모>> 자식)
        Child child = (Child) poly; //x001
        child.childMethod();
    }
}
