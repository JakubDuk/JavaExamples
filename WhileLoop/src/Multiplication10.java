import java.util.Scanner;
//Write a program to generate tables of 10
public class Multiplication10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        myObj.close();
        System.out.println("The multiplication table of " +num + " is :");
        int i = 1;

        while(i <= 10){
         System.out.printf("%d * %d = %d \n", num, i, num * i);
         ++i;

        //warning, no error control
        }
    }
}
