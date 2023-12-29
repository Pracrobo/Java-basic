package access.sol;

public class MaxCounter2 {
    private int count;
    private int max;

    public MaxCounter2() {
        this.count = 0;
    }

    public int increment() {
        return count++;
    }

    public int getCount() {
        return count;
    }

    public void printCounter(int count, int max) {
        if(max <= count){
            System.out.println("최대값을 초과할 수 없습니다.");
        }else{
           increment();
        }
    }
}