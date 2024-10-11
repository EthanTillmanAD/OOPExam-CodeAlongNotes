package exam;
//Is-A
public class HourlyEmployee extends Employee{

    private float hoursWorked;
    private double hourlyWage;


    public HourlyEmployee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }
    //overloaded constructor
    public HourlyEmployee(String name, Size size, Cloth[] clothingItems, float hoursWorked, double hourlyWage) {
        super(name, size, clothingItems);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
      if(hoursWorked > 0){
          this.hoursWorked = hoursWorked;
      }else{
          System.out.println("Error");
      }


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
      Cloth[] cloths = getClothingItems();
        for(Cloth j : cloths){
            System.out.print(j.getName() + " ");
        }

    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return false;
    }
}
