import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a number.");
            int age = myObj.nextInt();
            myObj.close();
            if (age > 0)

            System.out.println("Your number is positive");

            else if (age == 0) {
                System.out.println("Your number is 0.");   
            } 
            else {
                System.out.println("Your number is negative.");
            }
            

        } 
        catch (Exception e) {
            System.out.println("Please enter digits only!");
        }

        
    }
}
