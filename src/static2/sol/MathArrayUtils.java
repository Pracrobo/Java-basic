package static2.sol;

import java.util.Arrays;

public class MathArrayUtils {
    private int[] array;

    public static int sum(int[] values) {
        int total;
        for(int value : values) {
            total += value;
        }
        return total;
    }
    public static long average(int[] values) {
        int total = sum(values);
        return total / values.length;
    }
}
