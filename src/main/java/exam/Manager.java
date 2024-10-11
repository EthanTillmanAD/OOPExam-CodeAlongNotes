package exam;

public class Manager extends Employee{
    protected final double EXTRA_DISCOUNT = .05;
    private double salary;


    public Manager(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public Manager(String name,double salary ,Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.salary = salary;
    }

    @Override
    public double printPriceAfterDiscount(Cloth cloth) {

        double price = cloth.getPrice();//we need to get the price of the cloth we are trying to buy

        //we also need to find a way to get the discount amount
        double discountAmount = cloth.getPrice() * getManagerDiscount();//Multiply the price of the clothingItem by employees discount and store it in discountAmount

        return price - discountAmount; //return the subtraction of price from discountAmount
    }

    @Override
    public void printInfo() {
        System.out.print(this.getName() + "makes " + getSalary() + " and his shopping bag consists of the following clothing items: ");

        for(Cloth j : getClothingItems()){
            System.out.print(j.getName() + " ");
        }
        System.out.println("");
    }


    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getManagerDiscount(){
        return DISCOUNT + EXTRA_DISCOUNT;
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }
}
