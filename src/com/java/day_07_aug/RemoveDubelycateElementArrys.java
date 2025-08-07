package com.java.day_07_aug;

public class RemoveDubelycateElementArrys {
    public static void main(String[] args) {
        int arr[] = new int[] {1,3,4,5,3,2,5,2,4,8,9,10,11,12};
        for(int i = 0;i<arr.length;i++){
            int count =  0 ;
            for(int j = 0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
