package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
int sum = 0;
        if (lastInRow < 0) {
            System.out.print("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.print("number to skip is bugger then the last");
        }
        for (int i = 0; i < lastInRow; i++) {
            sum = sum+i;
            if (numberToSkip == i) {
                continue;
            }
        }
        System.out.print(sum);
    }
}
