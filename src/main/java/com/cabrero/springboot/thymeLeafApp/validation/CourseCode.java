package com.cabrero.springboot.thymeLeafApp.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode {

    public String value() default "LUV";
    public String message() default "must start with LUV";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
