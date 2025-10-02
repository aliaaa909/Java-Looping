import java.util.Scanner;

public class BmiApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat; 

        do {
            
            System.out.println("-----------------------------------");
            System.out.println("      BODY MASS INDEX COUNTER    ");
            System.out.println("-----------------------------------");

            System.out.print("Input Weight (kg) : ");
            double weight = input.nextDouble();

            System.out.print("Input Height (cm): ");
            double heightCM = input.nextDouble();

            double heightM = heightCM / 100.0;
          
            BMI patient = new BMI(weight, heightM);

            patient.displayResult();
          
            System.out.print("\nDo Another Checking? (Y/N): ");
            repeat = input.next();

        } while (repeat.equalsIgnoreCase("Y"));

        System.out.println("\nThankyou!");
        input.close();
    }
}
