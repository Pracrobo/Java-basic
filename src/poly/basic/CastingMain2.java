package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        //일시적 다운 캐스팅 바로 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); //연산자 우선순위때문에 ()

    }
}
