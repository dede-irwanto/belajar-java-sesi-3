package hari3.data;

public class Application {
    public static final int PROCESSORS;

    // static block
    static {
        System.out.println("Mengakses class application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
