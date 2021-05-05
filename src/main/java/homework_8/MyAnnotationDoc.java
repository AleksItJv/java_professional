package homework_8;

import java.lang.annotation.Documented;

/**
 * @author Alexander Kalyuzhniy
 */

@Documented
public @interface MyAnnotationDoc {
            String author();
            String date();
            int currentRevision() default 1;
            String lastModified() default "N/A";
            String lastModifiedBy() default "N/A";
            String[] reviewers();
        }

