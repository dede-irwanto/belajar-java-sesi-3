package hari3.application;

import hari3.data.LoginRequest;
import hari3.error.ValidationException;
import hari3.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Dede", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid " + e.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);

        ValidationUtil.validateRuntime(loginRequest2);
    }
}
