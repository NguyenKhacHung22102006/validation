package re.validationb3.Annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = re.validationb3.Validator.MultipleOfTenThousandValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RUNTIME)
public @interface MultipleOfTenThousand {
    String message() default "Số tiền phải là bội số của 10.000";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
