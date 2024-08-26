package com.cabrero.springboot.thymeLeafApp.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    String requiredPrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        this.requiredPrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (s == null) {
            result = false;
        }
        if (s.startsWith(this.requiredPrefix)) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
