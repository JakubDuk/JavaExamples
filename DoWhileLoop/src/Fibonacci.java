public class Fibonacci {
    //no imput
    public static void main(String[] args) throws Exception {
        
        System.out.println();
        System.out.println("First 10 Fibonacci numbers");
        int n1=0;
        int n2=1;
        int n3;
        int i =1, count = 10;

        do {
            n3=n1+n2;    
            System.out.println(n3);    
            n1=n2;    
            n2=n3;
            ++i;  
        } while (i<=count);  
    }
}
