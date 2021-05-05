package homework_8.task3.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface PredatorsAnno {
    String str() default "Predator";
}
