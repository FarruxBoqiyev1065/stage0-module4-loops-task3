package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= lastFibonacci; ++i) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
