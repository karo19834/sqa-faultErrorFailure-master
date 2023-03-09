package at.campus02.example;

public class FaultTwo {
    /**
     * Effect: if x==null throw NullPointerException.
     * Otherwise, return the index of the last element in the array ‘x’ that equals integer ’y’.
     * Return -1 if no such element exists.
     */
    public static int findLast(int[] x, int y) {
        for (int i = x.length - 1; i > 0; i--) {  // >= statt nur >
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
}

/*
    Read this faulty program, which includes a test case that results in failure.
    Answer the following questions:
    (a) Identify the fault.
    (b) If possible, identify a test case that does not execute the fault.
    (c) If possible, identify a test case that executes the fault, but does not
        result in an error state.
    (d) If possible identify a test case that results in an error, but not a failure.
    (e) Fix the fault.
*/
