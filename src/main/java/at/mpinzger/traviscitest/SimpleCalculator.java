package at.mpinzger.traviscitest;

import java.util.List;
import java.util.Set;

public class SimpleCalculator {
    private List<Integer> setOfIntegers;
    public SimpleCalculator(List<Integer> setOfIntegers) {
        this.setOfIntegers = setOfIntegers;
    }

    public int sum() {
        int sum = 0;
        for (int value : setOfIntegers) {
            sum += value;
        }

        return sum;
    }
}
