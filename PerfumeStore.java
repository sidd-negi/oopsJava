import java.util.Scanner;

class Perfume {
    protected String brand;

    public Perfume(String brand) {
        this.brand = brand;
    }

    public void suggest() {
        System.out.println("Suggested Perfume Brand: " + brand);
    }
}

class GenderPerfume extends Perfume {

    public GenderPerfume(String brand) {
        super(brand);
    }
}

public class PerfumeStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (male/female): ");
        String gender = sc.nextLine();

        if (gender.equalsIgnoreCase("male")) {
            GenderPerfume p = new GenderPerfume("Dior Sauvage");
            p.suggest();
        } 
        else if (gender.equalsIgnoreCase("female")) {
            GenderPerfume p = new GenderPerfume("Chanel");
            p.suggest();
        } 
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
