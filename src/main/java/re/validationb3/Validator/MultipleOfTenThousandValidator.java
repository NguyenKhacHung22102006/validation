package re.validationb3.Validator;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import re.validationb3.Annotation.MultipleOfTenThousand;

public class MultipleOfTenThousandValidator
        implements ConstraintValidator<MultipleOfTenThousand, Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        if (value < 50000) {
            return false;
        }
        if (value % 10000 != 0) {
            return false;
        }
        return true;
    }
}