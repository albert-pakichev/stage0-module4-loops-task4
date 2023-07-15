package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
for (int i = 0; i < numberToSkip; i++) {
        if (numberToSkip > lastInRow) {
            System.out.print("number to skip is bugger then the last");
            continue;
        } else if (lastInRow < 0) {
            System.out.print("last number in row is negative");
            continue;
        } else {
            int sum = numberToSkip + lastInRow;
            System.out.print("counted sum is number" + sum);
        }
    }
    }
}
