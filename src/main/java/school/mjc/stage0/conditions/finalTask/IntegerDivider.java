package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int multiplyResult, divisionResult;

        divisionResult = dividend / divider;

        multiplyResult = divisionResult & divider;

        System.out.println(multiplyResult);
    }
}
