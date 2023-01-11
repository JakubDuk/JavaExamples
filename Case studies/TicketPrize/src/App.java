import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        int num;
        System.out.println("Please enter number of tickets");
        num = obj.nextInt();
        obj.close();
        double price;
        if (num <=10) {
          price = num * 400;
        } else {
        price = num * 400 * 0.9; 
        }
        System.out.println("Ticket price is Rs." + price);
    }
}
