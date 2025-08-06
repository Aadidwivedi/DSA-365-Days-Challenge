package com.java.day_06_aug;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = new int[] {1,5,7,3,8,2,9};
        System.out.print("Orginal Arrays is : ");
        for(int j = 0 ;j< arr.length;j++){
            System.out.print(arr[j] +" ");
        }
        int smallest = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }

        }
        System.out.println();

        System.out.println("Find  Smallest elements is : " + smallest);
    }
}
