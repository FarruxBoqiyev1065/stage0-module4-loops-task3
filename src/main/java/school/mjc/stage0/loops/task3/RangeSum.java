package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int count = 0;
        if (firstBoarder < secondBoarder && firstBoarder > 0){
            for (firstBoarder = 1; firstBoarder <= secondBoarder; firstBoarder++){
                count += firstBoarder;
            }
            System.out.println(count);
        } else if (firstBoarder == secondBoarder) {
            System.out.println(firstBoarder);
        } else if (firstBoarder < 0 ) {
            secondBoarder = -firstBoarder;
            System.out.println(firstBoarder + secondBoarder);
        }
    }
}
