package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int b = 1;
        int a = Math.min(first, second);
        if (a > 0){
            for (int i = 1; i <= a; i++){
                if (first % i == 0 && second % i == 0)
                    b = i;
            }
            System.out.println(b);
        } else if (a == 0) {
            System.out.println(Math.max(first, second));
        }
    }
}
