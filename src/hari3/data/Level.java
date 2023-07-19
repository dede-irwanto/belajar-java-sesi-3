package hari3.data;

// enum di java
public enum Level {
    STANDARD("Standar level"),
    PREMIUM("Premium level"),
    VIP("VIP level");

    private String description;

    Level(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
