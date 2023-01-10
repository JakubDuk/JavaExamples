import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number 0 to 20");
        int num = myObj.nextInt();
        myObj.close();
        long factorial = 1;
        int i = 1;

        while (i <= num)
        {
            // factorial = factorial * i;
            factorial *= i;
            ++i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

        //warning, no error control
        
    }
}
