package hari1;

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // kata kunci super digunakan untuk memangil parent method
        return super.getCorner();
    }
}
