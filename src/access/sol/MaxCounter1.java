package access.sol;

public class MaxCounter1 {
    private int count = 0;
    private int max;

    public MaxCounter1(int max) {
        this.max = max;
    } //생성자

    public void increment() {
        if(count>= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; // 바로 나가는것 //if-else 랑 똑같은데 검증로직 , 실행로직으로 나눠서 return 쓰는 스타일 써도 된다.
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}