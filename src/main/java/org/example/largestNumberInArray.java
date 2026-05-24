package org.example;

public class largestNumberInArray {
    static void main(String[] args){

        int[] arr = {10, 20, 40, 120,110 ,190, 50, 60,70, 80};
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest in the Array = "+ max);
    }
}
