package org.example;

public class binarySearch {
    public static void main (String[] args) {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int target = 90;
        int low = 0;
        int high = arr.length -1;
        boolean found = false;
        System.out.print("Binary Search = ");
        while (low <= high){
            int mid = (high + low) / 2;
            if (arr[mid] == target){
                System.out.print("Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid]<target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found){
            System.out.println("Element not found");
        }

    }
}







