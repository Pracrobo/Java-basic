package static2.sol;

import java.util.Arrays;

public class MathArrayUtils {
    private  MathArrayUtils() {
        //private 인스턴스 생성을 만든다.
    }
 //   private int[] array;

    public static int sum(int[] values) {
        int total = 0;
        for(int value : values) {
            total += value;
        }
        return total;
    }
    public static long average(int[] values) {
        return sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for(int value : values) {
            if(value < minValue) {
                minValue = value;
            }
        } return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if(value > maxValue) {
                maxValue  = value;
            }
        }
        return maxValue;
    }
}
