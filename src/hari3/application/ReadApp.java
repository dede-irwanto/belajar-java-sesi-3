package hari3.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {


        // try with resource (auto close resource)
        try (BufferedReader reader = new BufferedReader(new FileReader("README.MD"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println("Error membaca file " + e.getMessage());
        }
    }
}
