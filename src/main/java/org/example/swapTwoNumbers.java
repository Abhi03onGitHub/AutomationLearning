package org.example;

public class swapTwoNumbers {
    static void main(String[] args){

        int a = 29;
        int b = 37;

        System.out.println("Numbers before gets swapped");
        System.out.println("a = " +a+" b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("======================================");
        System.out.println("Numbers After gets swapped");
        System.out.println("a = " +a+" b = "+b);

    }
}
