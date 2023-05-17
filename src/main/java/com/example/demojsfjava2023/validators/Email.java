package com.example.demojsfjava2023.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = EmailValidator.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface Email {

    String message() default "Is not a valid email";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
