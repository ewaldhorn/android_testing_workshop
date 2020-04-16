package za.co.nofuss.testingtests.calculators;

public class SummingCalculator {
    public int sumThis(int... args) {
        int total = 0;

        for (int i : args) {
            total += i;
        }

        return total;
    }
}
