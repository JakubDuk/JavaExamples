import java.util.Scanner;
//Write a program to add the digits of a number.
public class AddDigits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        myObj.close();
        
        int sum;

        for(sum = 0; num != 0; num = num / 10){
         
         sum = sum + num % 10;
        }
        System.out.println("Sum of digits is " + sum);

        //warning, no error control
        
    }
}
