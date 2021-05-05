package homework_8.add_task.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MathAnno {

    MathAnnoRepeatable[] value();

    //int num() default 0;
}
