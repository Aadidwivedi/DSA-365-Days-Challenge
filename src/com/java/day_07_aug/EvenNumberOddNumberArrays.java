package com.java.day_07_aug;

public class EvenNumberOddNumberArrays {
    public static void main(String[] args) {
        System.out.print("Even Numbers : ");
        int arr[] = new int[] {1,3,4,6,8,5,9};
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers : ");
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
