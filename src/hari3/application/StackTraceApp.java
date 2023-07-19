package hari3.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            String[] names = {
                    "Dede", "Irwanto"
            };

            System.out.println(names[10]);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
