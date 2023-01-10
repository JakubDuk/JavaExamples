import java.util.Scanner;
//Write a program to add the digits of a number.
public class AddDigits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        myObj.close();
        
        int sum = 0;

        while(num != 0){
         
         sum = sum + num % 10;
         num = num / 10;
        }
        System.out.println("Sum of digits is " + sum);

        //warning, no error control
        
    }
}
