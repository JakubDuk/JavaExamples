import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter your age.");
            int age = myObj.nextInt();
            myObj.close();
            if (age > 17)

            System.out.println("You can vote!");

            else
            System.out.println("Sorry, You are to young to vote.");

        } 
        catch (Exception e) {
            System.out.println("Please enter digits only!");
        }

        
    }
}
