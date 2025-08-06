package com.java.day_06_aug;

public class FindSecondLargestElemenInArrays {
    public static void main(String[] args) {
        int arr[] = new int[] {1,5,7,3,8,2,9};
        System.out.print("Orginal Arrays is : ");
        for(int j = 0 ;j< arr.length;j++){
            System.out.print(arr[j] +" ");
        }
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println();
        System.out.println("Find Second laggest elements  is : " + arr[1]);
    }
}
