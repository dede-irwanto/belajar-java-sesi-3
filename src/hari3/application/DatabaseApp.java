package hari3.application;

import hari3.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null, null);
        System.out.println("Sukses");

    }
    //error exception
    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
