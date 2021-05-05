package homework_8.task2;

/**
 * @author Alexander
 */

import homework_8.task2.annotation.CalculatorValues;

import java.lang.reflect.Method;
import java.util.Scanner;

public class CalculatorRuntime {
    /**
     * @param args
     */
    public static void main(String[] args) {

        CalculatorMethods calcAnno = new CalculatorMethods();
        Class<?> cl = CalculatorMethods.class;
/*        Method[] methods = cl.getDeclaredMethods();
        for (Method mt : methods) {
            System.out.println(mt.getName());
        }*/
        try {
            Method method1 = cl.getDeclaredMethod("additionNumbers", int.class, int.class);
            Method method2 = cl.getDeclaredMethod("subtractionNumbers", int.class, int.class);
            Method method3 = cl.getDeclaredMethod("divisionNumbers", int.class, int.class);
            Method method4 = cl.getDeclaredMethod("multiplicationNumbers", int.class, int.class);
            CalculatorValues calcValues1 = method1.getAnnotation(CalculatorValues.class);
            CalculatorValues calcValues2 = method2.getAnnotation(CalculatorValues.class);
            CalculatorValues calcValues3 = method3.getAnnotation(CalculatorValues.class);
            CalculatorValues calcValues4 = method4.getAnnotation(CalculatorValues.class);

            /**
             *
             * @param System.in
             */
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter arithmetic operator");
            switch (sc.nextLine()) {
                case "+": {
                    System.out.println(calcAnno.additionNumbers(calcValues1.num1(), calcValues1.num2()));
                    break;
                }
                case "-": {
                    System.out.println(calcAnno.subtractionNumbers(calcValues2.num1(), calcValues2.num2()));
                    break;
                }
                case "/": {
                    System.out.println(calcAnno.divisionNumbers(calcValues3.num1(), calcValues3.num2()));
                    break;
                }
                case "*": {
                    System.out.println(calcAnno.multiplicationNumbers(calcValues4.num1(), calcValues4.num2()));
                    break;
                }
                default: {
                    System.out.println("Incorrect operator");
                    break;
                }
            }


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
