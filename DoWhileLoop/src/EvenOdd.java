public class EvenOdd {
    //no imput
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Print 10 odd numbers");
        int index = 1;

        do {
            System.out.println(index); 
            index = index + 2; 
        } while (index <= 20);
        
        System.out.println();
        System.out.println("Print 10 even numbers");
        int index2 = 2;

        do {
            System.out.println(index2);
            index2 = index2 + 2;
        } while (index2 <= 20);
    }
}
