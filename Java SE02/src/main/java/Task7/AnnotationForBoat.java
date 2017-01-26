package Task7;

import java.lang.annotation.*;

/**
 * Created by User on 26.01.2017.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationForBoat {
    String country();
    String port();
}
