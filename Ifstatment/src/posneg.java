import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a number.");
            int age = myObj.nextInt();
            myObj.close();
            if (age > 0)

            System.out.println("Your number is positive");

            else
            System.out.println("Your number is negative or 0.");

        } 
        catch (Exception e) {
            System.out.println("Please enter digits only!");
        }

        
    }
}
