package domain;

/**
 * @author Prashant
 */
public @interface NotBlank {
    String message() default "{org.hibernate.validator.constraints.NotBlank.message}";

}
