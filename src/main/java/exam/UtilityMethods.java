package exam;

public class UtilityMethods {

    public static boolean checkFitting(Customer customer, Cloth cloth){
        //we need to get customers size
        //we need to get the cloth size

        if(customer.getSize().equals(cloth.getSize())){ //compare the two see if they match
            return true;
        }else{
            return false;
        }
    }

    public static double calculateSubTotals(Cloth[] cloths){
        double total = 0;// container that holds subtotal
        for(Cloth j : cloths){// loop through the clothingItems array

            total += j.getPrice();// grab each price and add it to current total
        }
        return total;// return final total
    }

    public static void printClassNamesOfPayables(IPayable[] payables){
        //todo - figure out how to get the class names of each payable entity
        for(IPayable j : payables){
            System.out.println(j.getClass().getSimpleName());
        }

    }


    public static void checkCustomerDiscount(Customer customer){
        if(customer instanceof HourlyEmployee){

            System.out.println( customer.getClass().getSimpleName() + " qualifies for a discount of " + ((HourlyEmployee) customer).DISCOUNT * 100 + "%");

        }if (customer instanceof Manager){

            String result = String.format(" qualifies for a discount of %.2f", ((Manager) customer).getManagerDiscount() * 100);
            System.out.println( customer.getClass().getSimpleName() + result + "%");


        }if(customer instanceof Student){

            System.out.println( customer.getClass().getSimpleName() + " qualifies for a discount of " + ((Student) customer).getDISCOUNT() * 100 + "%");
        }
    }
}
