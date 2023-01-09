import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter first number.");
            int num1 = myObj.nextInt();
            System.out.println("Enter second number.");
            int num2 = myObj.nextInt();
            myObj.close();
            
            if (num1 > num2)

            System.out.println(num1 + " is larger.");
            else if (num1 == num2) {
                System.out.println("Numbers are equal.");
            } 
            else {
                System.out.println(num2 + " is larger");
            }
        
        } 
        catch (Exception e) {
            System.out.println("Please enter digits only!");
        }

        
    }
}
