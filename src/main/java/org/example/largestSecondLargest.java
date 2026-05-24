package org.example;

public class largestSecondLargest {
    static void main(String[] args){

    int[] arr = {10, 20, 40, 120,110 ,190, 50, 60,70, 80};
    int max = arr[0];
    int secondMax = arr[0];

    for(int i=1; i<arr.length;i++){
        if (arr[i]>max){
            secondMax = max;
            max = arr[i];
        }
        else if(arr[i]>secondMax && arr[i] != max)
        {
            secondMax = arr[i];
        }

    }
    System.out.println("Largest in the Array = "+ max);
    System.out.println("Second Largest in the Array = "+ secondMax);
}
}
