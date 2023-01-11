import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 0, num2 = 0, price1, price2, total;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter number of Silver tickets");
        num1 = obj.nextInt();
        System.out.println("Please enter number of Gold tickets");
        num2 = obj.nextInt();
        obj.close();

        price1 = num1 * 150;
        price2 = num2 * 200;
        
        total = price1 + price2;
        System.out.println("Total cost of tickets is Rs." + total);
    }
}
