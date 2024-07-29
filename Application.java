
public class Application {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(8, 5);
        RationalNumber r2 = new RationalNumber(1, 8);
        RationalNumber r3 = new RationalNumber(20, 4);

        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
        System.out.println("R3: " + r3);

        System.out.println("R1 compareTo R2: " + r1.compareTo(r2)); // 
        System.out.println("R1 compareTo R3: " + r1.compareTo(r3)); // 
        System.out.println("R2 compareTo R3: " + r2.compareTo(r3)); // 
    }
}

