package exam;

public abstract class Employee extends Customer implements IPayable{

    protected final double DISCOUNT = .10;

    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
