package org.example;
import java.util.Scanner;

class fibonacciSeries {
    static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many count you required for the Fibonacci Series = ");
    int count = scanner.nextInt();
    int a = 0;
    int b = 1;
    if (count == 0) {
        System.out.print("Can't Print Fibonacci Series - Exiting Code");
        System.exit(0);
    }
    System.out.print("Fibonacci Series - ");
    if (count == 1) {
        System.out.print(a);
        System.exit(0);
    }
    if (count == 2) {
        System.out.print(a+" "+ b);
        System.exit(0);
    }
    System.out.print(a+" "+b+" ");
    for(int i=3;i<=count;i++){
        int next = a + b;
        System.out.print(next + " ");
        a=b;
        b=next;
    }
}

}
