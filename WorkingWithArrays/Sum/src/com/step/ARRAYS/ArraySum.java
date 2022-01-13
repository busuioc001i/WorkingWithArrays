package com.step.ARRAYS;

import java.util.Arrays;

public class ArraySum {


        static int[] arr = { 12, 3, 4, 15 };

        static int sum()
        {
            int sum = 0;
            int i;

            for (i = 0; i < arr.length; i++)
                sum += arr[i];

            return sum;
        }


        public static void main(String[] args)
        {
            System.out.println("Entered array is :" + Arrays.toString(arr));

            System.out.println("Sum of this array is :  " + sum());

        }



}
