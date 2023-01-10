public class EvenOdd {
    //no imput
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Print 10 odd numbers");
        for (int index = 1; index <= 20; index = index + 2) {
        System.out.println(index);    
        }
        System.out.println();
        System.out.println("Print 10 even numbers");
        for (int index = 2; index <= 20; index = index + 2) {
            System.out.println(index);
        }
    }
}
