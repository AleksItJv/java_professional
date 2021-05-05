package homework_8.task2;

import homework_8.task2.annotation.CalculatorValues;

/**
 * @author Alexander
 */

public class CalculatorMethods {
    /**
     * @param num1
     * @param num2
     * @return sum of numbers num1 and num2
     */

    @CalculatorValues(num1 = 1, num2 = 1)
    public int additionNumbers(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * @param num1
     * @param num2
     * @return subtraction of numbers num1 and num2
     */
    @CalculatorValues(num1 = 5, num2 = 2)
    public int subtractionNumbers(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * @param num1
     * @param num2
     * @return division of numbers num1 and num2
     */
    @CalculatorValues(num1 = 16, num2 = 4)
    public int divisionNumbers(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * @param num1
     * @param num2
     * @return multiplication of numbers num1 and num2
     */
    @CalculatorValues(num1 = 5, num2 = 1)
    public int multiplicationNumbers(int num1, int num2) {
        return num1 * num2;
    }
}
