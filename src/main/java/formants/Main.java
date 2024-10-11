package formants;

public class Main {
    public static void main(String[] args) {
       // System.out.printf("Fromat to two decimal places %.2f", 99.090990099);
       String result = String.format("Fromat to two decimal places %,d", 100000);
        System.out.println(result);
    }

}
