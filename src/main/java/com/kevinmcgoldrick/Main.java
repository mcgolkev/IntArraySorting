package com.kevinmcgoldrick;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        sumIntArray();
        findLargest();
        boxingPrimitiveArray();
        misc();

    }

    private static void sumIntArray(){
        int sumer=0;
        int[] numbers = {3,55,62,3,8,66,431};

        for (int i =0; i<numbers.length; i++){
            sumer += numbers[i];
        }
        System.out.println(sumer);

    }

    private  static void findLargest(){
        int[] numbers = {3,55,62,2344,3,8,66,431};
        int largestNum = 0;

        for (int i =0; i<numbers.length; i++){
            if (largestNum < numbers[i]){
                largestNum = numbers[i];
            }
        }
        System.out.println(largestNum);

        //print largest number
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);

        //print smallest number
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
    }

    private static void boxingPrimitiveArray(){
        int[] numbers = {3,55,62,2344,3,8,66,431};

        // natural order sort of primitive int[]
        Arrays.sort(numbers);
        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //print array without for loop
        System.out.println(Arrays.toString(numbers));

        // box int[] to Integer[]
        Integer[] boxedNumbers = Arrays.stream( numbers ).boxed().toArray( Integer[]::new );

        // sorted reverse order
        Arrays.sort(boxedNumbers, Collections.reverseOrder());

        for (int i=0; i<boxedNumbers.length; i++){
            System.out.println(boxedNumbers[i]);
        }

        System.out.println(Arrays.toString(boxedNumbers));

        //  sorted natural order
        Arrays.sort(boxedNumbers);

        for (int i=0; i<boxedNumbers.length; i++){
            System.out.println(boxedNumbers[i]);
        }

        System.out.println(Arrays.toString(boxedNumbers));



    }

    private static void misc(){
        // swap variable values without a third variable name
        int a = 10;
        int b = 30;

        System.out.println("BEFORE - a = " +a + " b = " +b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("AFTER - a = " +a + " b = " +b);
    }
}