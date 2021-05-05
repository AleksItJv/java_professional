package homework_8.task3.annotation;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalRun {
    String str() default " normal speed";
}
