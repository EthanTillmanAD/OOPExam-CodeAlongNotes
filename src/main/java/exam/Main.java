package exam;

public class Main {

    public static void main(String[] args) {

        HourlyEmployee he1  ;
        //datatype       ^^referenceVariable = new Object() on the heap;

        Cloth clothingItem1 = new Cloth("Jeans", 20.00, Size.S);// element 1 || index 0
        Cloth clothingItem2 = new Cloth("T-Shirt", 8.00, Size.M);// element 2 || index 1
        Cloth clothingItem3 = new Cloth("Hat", 2.00, Size.L);// element 3 || index 2

       Cloth[] shoppingBag = {clothingItem1, clothingItem2, clothingItem3};// array literal

//        Cloth[] shoppingBag = new Cloth[3];
//        shoppingBag[0] = clothingItem1;
//        shoppingBag[1] = clothingItem2;
//        shoppingBag[2] = clothingItem3;
       // HourlyEmployee he3 = new HourlyEmployee("Alex", Size.S, shoppingBag);
        HourlyEmployee he2 = new HourlyEmployee("Alex", Size.S, shoppingBag, 40.0f, 20.0);

        he2.setHoursWorked(100);

        //he2.printInfo();

        System.out.println( he2.printPriceAfterDiscount(clothingItem1));

        Student student1 = new Student("Mike", Size.L, shoppingBag);
        Student student2 = new Student("jane", Size.S, shoppingBag);

        Student.printStudentCounter();

        UtilityMethods.checkFitting(he2, clothingItem1);
        //   ClassName.methodName(); // they belong to the class not the objects

        Manager manager = new Manager("Terry", Size.L, shoppingBag);
        Business business = new Business("Comcast" , 1000, 300.00);

        IPayable[] payables = { he2, manager, business};

        UtilityMethods.printClassNamesOfPayables(payables);

        System.out.println("Subtotal of items is: $" + UtilityMethods.calculateSubTotals(shoppingBag));

        manager.printInfo();
        student1.printInfo();

        System.out.println(business.calculatePay());

        UtilityMethods.checkCustomerDiscount(he2);
        UtilityMethods.checkCustomerDiscount(manager);
        UtilityMethods.checkCustomerDiscount(he2);
   }

}


