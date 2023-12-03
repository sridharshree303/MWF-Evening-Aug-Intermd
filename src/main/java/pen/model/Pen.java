package pen.model;

public abstract class Pen {
    String name;
    String brand;
    int price;
    PenType type;

    public abstract void write();
}
