package at.campus02.example;

public class FaultOne {
    /**
     * Effects: if x==null throw NullPointerException;
     * else return the number of occurrences of 0 in x
     */
    public static int numZero(int[] x) {
        int count = 0;
        if (x.length == 0)
            return 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
