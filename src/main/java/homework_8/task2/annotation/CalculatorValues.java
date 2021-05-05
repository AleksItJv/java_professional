package homework_8.task2.annotation;

/**
 * @author
 */

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CalculatorValues {

    int num1() default 0;

    int num2() default 0;

}
