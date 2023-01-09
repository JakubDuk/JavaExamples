import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a number.");
            int num = myObj.nextInt();
            myObj.close();
            
            int res = (num % 2);
            
            if (res > 0){
                System.out.println("Your number is odd");
            }
            else {
            System.out.println("Your number is even.");
            }

        } 
        catch (Exception e) {
            System.out.println("Please enter digits only!");
        }

        
    }
}
