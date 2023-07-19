package hari3.application;

import hari3.data.CreateUserRequest;
import hari3.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("dee");
        request.setPassword("rahasia");

        ValidationUtil.validationReflection(request);

    }
}
