package com.java.day_03_aug;

public class DubleycateArrayAnyNumber {

    public static void main(String[] args) {

        int arr[] = new int[]{12, 34, 12, 12, 89, 34, 67, 34};

        for (int i = 0; i < arr.length; i++) {
             int count = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            int c = 0;
            for(int j = 0 ;j<=i;j++) {
                if (count > 1) {
                    if (arr[i] == arr[j]) {
                       c++;
                    }
                }
            }
            if (c == 1) {
                System.out.println(arr[i] + " " + count);

            }
        }
    }
}
