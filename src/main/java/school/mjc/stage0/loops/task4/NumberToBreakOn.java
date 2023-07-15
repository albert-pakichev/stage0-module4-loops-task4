package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
    if (numberToGoUntil >= toBreakWith) {
            for (int i = 0; i < numberToGoUntil; i++) {
                if (toBreakWith == i) {
                    break;
                }
                System.out.print(i);
            }
        } else {
            for (int f = 0; f < numberToGoUntil; f++) {
                System.out.print(f);
            }
        }
    }
}
