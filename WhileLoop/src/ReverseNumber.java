import java.util.Scanner;
//Write a program to reverse the digits of a number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        myObj.close();

        int reverse = 0;

        while(num != 0){
         
            int rem = num % 10;
            reverse = reverse * 10 +rem;
            num = num / 10;

        }
        System.out.println("Reverse of the given number is " + reverse);

        //warning, no error control
        
    }
}
