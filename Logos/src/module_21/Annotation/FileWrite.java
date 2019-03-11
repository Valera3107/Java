package module_21.Annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface FileWrite {
  boolean params() default false;

  String role() default  "check fields before writing to file";

  String msg() default "functional same on transient key word in Serialization";
}
