package com.java.day_03_aug;

public class DubleyCateArry {
    public static void main(String[] args) {
        int[] arr = new int[] {2,6,2,5,5,6,5};

        for(int j = 0;j<=9;j++) {
            int count = 0  ;
            
            for (int i = 0; i < arr.length; i++) {
               if(arr[i] == j){
                   count++;
               }
            }
            if(count > 1){
                System.out.println(j +" " +count);
            }
        }
    }
}
