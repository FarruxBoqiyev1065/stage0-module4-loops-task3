package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int a = 9;

        for (int i = 0; i < lengthOfLastNumber; i++){
           sum += a;
           a = a * 10 + 9;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        calculateSum(6);
    }
}
