package homework_8.add_task.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(MathAnno.class)
public @interface MathAnnoRepeatable {
    int value();
}
