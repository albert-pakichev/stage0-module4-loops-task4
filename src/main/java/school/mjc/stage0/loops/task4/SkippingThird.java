package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
int i = 0;
for(i = 0; i<lastPrinted; i++) {
    if(i%3 == 0) {
        continue;
    }
    System.out.print(i);
}
    }
}
