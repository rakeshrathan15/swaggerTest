package com.neoteric.swaggerTest.customvalidations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = DateLimitValidator.class) // ✅ Ensure this is correctly linked
@Target({ ElementType.TYPE }) // ✅ Use TYPE because the validation is for a class, not a field
@Retention(RetentionPolicy.RUNTIME)
public @interface DateValidation {

    String message() default "Invalid Date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String pattern() default "yyyy-mm-dd";

   // String date();




}
