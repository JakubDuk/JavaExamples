import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter first number :");
            int num1 = myObj.nextInt();
            System.out.println("Enter second number :");
            int num2 = myObj.nextInt();
            myObj.close();

            int sum 		= num1 + num2;
            int difference 	= num1 - num2;
            int multiplication 	= num1 * num2;
            int increment1 = num1;
            int increment2 = num2;
            int decrement1 = num1;
            int decrement2 = num2;

            System.out.println("Sum : " + sum);
            System.out.println("Difference : " + difference);
            System.out.println("Multiplication : " + multiplication);
            if (num2 != 0) {
               float division = (float)num1 / num2;
               System.out.println("Division : " + division);
            }
            else {
                System.out.println("Cannot divide with 0!");
            }
            System.out.println("Increment First Number: " + ++increment1);
            System.out.println("Increment Second Number: " + ++increment2);
            System.out.println("Decrement First Number: " + --decrement1);
            System.out.println("Decrement Second Number: " + --decrement2);
            } 
        catch (Exception e) {
            System.out.println("Please enter digits only!");
            }
    }
}
