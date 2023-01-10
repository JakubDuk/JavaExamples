public class Fibonacci {
    //no imput
    public static void main(String[] args) throws Exception {
        
        System.out.println();
        System.out.println("First 10 Fibonacci numbers");
        int n1=0;
        int n2=1;
        int n3;
        int i, count = 10;

        for(i=1;i<=count;++i){

        n3=n1+n2;    
        System.out.println(n3);    
        n1=n2;    
        n2=n3;    
        }    
    }
}
