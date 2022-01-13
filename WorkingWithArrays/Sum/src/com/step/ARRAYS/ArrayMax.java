package com.step.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter int for array[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is :" + Arrays.toString(arr));

       int maxNum = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println("Max number from array is : " + maxNum);

        int minNum = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] < minNum){
                minNum = arr[i];
            }
        }
        System.out.println("Min number from array is : " + minNum);


    }

}
