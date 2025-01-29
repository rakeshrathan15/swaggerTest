package com.neoteric.swaggerTest.customvalidations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateLimitValidator implements ConstraintValidator<DateValidation, Customer> {

    @Override
    public void initialize(DateValidation constraintAnnotation) {
        // No need to call super.initialize() since it's a default method
    }

    @Override
    public boolean isValid(Customer customer, ConstraintValidatorContext context) {
        if (customer == null || customer.getFromDate() == null || customer.getToDate() == null) {
            return false; // Invalid if customer or dates are null
        }

        if (customer.getFromDate().isAfter(customer.getToDate())) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("From date should be before To date")
                    .addPropertyNode("fromDate")
                    .addConstraintViolation();
            return false; // Return false to indicate validation failure
        }

        return true; // Valid case
    }
}
