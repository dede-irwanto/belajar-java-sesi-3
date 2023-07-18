package hari3.data;

//interface inheritance
public interface Car extends HasBrand {
    void drive();

    int getTier();

//    default method
    default boolean isBig() {
        return false;
    }
}
