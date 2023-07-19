package hari3.util;

import hari3.annotation.NotBlank;
import hari3.data.LoginRequest;
import hari3.error.BlankException;
import hari3.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    // checked exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {

        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }

    }


    //runtime exception
    public static void validateRuntime(LoginRequest loginRequest) {

        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("Password is blank");
        }

    }

    // reflection
    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // validate
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
