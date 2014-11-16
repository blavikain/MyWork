import java.util.Arrays;

public class PeakFinding {
    public static void main(String[] args) {
        int N = 999990;
        int[] array = new int[1000000];
        for (int i = 0; i <= N; i++){
            array[i] = (int)(Math.random() * 100000000);
        }
        Arrays.sort(array, 0, N);

        int MAX = array[N] - 1;
        for (int i = N+1; i < 1000000; i++) {
            array[i] = MAX;
            MAX--;
        }
        Arrays.fill(array, N+1, 999999, 0);

        double startTime = System.currentTimeMillis();
        System.out.println( findAPeak(array, 0, array.length-1));
        double endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        double startTime2 = System.currentTimeMillis();
        System.out.println(findAPeakRecursive(array, 0, array.length-1));
        double endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }

    public static int findAPeak(int[] array, int start, int end) {
        if (array[start] > array[start+1])
            return start;
        if (array[end] > array[end-1])
            return end;
        for (int i = start+1; i < end; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1])
                return i;
        }
        return -1;
    }

    public static int findAPeakRecursive(int[] array, int start, int end) {
        if (array[(start+end)/2] < array[(start+end)/2 + 1])
            return findAPeakRecursive(array, (start+end)/2 + 1, end);
        else if (array[(start+end)/2] < array[(start+end)/2 - 1])
            return findAPeakRecursive(array, start, (start+end)/2 - 1);
        else return (start+end)/2;
    }
}
