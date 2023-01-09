public class Datatypes {
    public static void main(String[] args) {
        byte num1 = 122;
        short num2 = 13444;
        int num3 = 1999666333;
        long num4 = 725185481548L;
        float num5 = 3.245634F;
        double num6 = 3.982928659265926;
        boolean wal = false;
        char let = 'C';

        System.out.println();
        System.out.println("Primitive Data Types");
        System.out.println("Byte stores whole numbers from -128 to 127. For Example " + num1);
        System.out.println("Short stores whole numbers from -32,768 to 32,767. For Example " + num2);
        System.out.println("Int stores whole numbers from -2,147,483,648 to 2,147,483,647. For Example " + num3);
        System.out.println("Long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. For Example " + num4);
        System.out.println("Float stores fractional numbers. Sufficient for storing 6 to 7 decimal digits. For Example " + num5);
        System.out.println("Double stores fractional numbers. Sufficient for storing 15 decimal digits. For Example " + num6);
        System.out.println("Boolean stores true or false values. For Example " + wal);
        System.out.println("Char stores a single character/letter or ASCII values. For Example " + let);
        System.out.println();
        System.out.println("Arithmetic Operators");
        int sum = num1 + num2;
        System.out.println("Sum of byte and short = " + sum);
        long dif = (long) num4 - num3;
        System.out.println("Subtraction of long and int = " + dif);
        double multi = num1 * num6;
        System.out.println("Multiplication of byte and double = " + multi);
        float dev = num2 / num5;
        System.out.println("Division of short and float = " + dev);
        int mod = num2 % num1;
        System.out.println("Division remainder of short and byte = " + mod);
        System.out.println("Increment by 1 of double = " + ++num6);
        System.out.println("Decrement by 1 of byte = " + --num1);


    }
}
