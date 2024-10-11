package exam;

public class Student extends Customer {
    private long studentID;
    private static long studentCounter;
    private final double DISCOUNT = .05;


    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        studentCounter ++;
       this.studentID = studentCounter;

    }



    public long getStudentID() {
        return studentID;
    }

    public static void printStudentCounter() {
        System.out.println(studentCounter);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double printPriceAfterDiscount(Cloth cloth) {

        double price = cloth.getPrice();//we need to get the price of the cloth we are trying to buy

        //we also need to find a way to get the discount amount
        double discountAmount = cloth.getPrice() * DISCOUNT;//Multiply the price of the clothingItem by employees discount and store it in discountAmount

        return price - discountAmount; //return the subtraction of price from discountAmount
    }

    @Override
    public void printInfo() {
        System.out.println("Student ID " + studentID
        + " : Student Name : " + this.getName());
    }
}
