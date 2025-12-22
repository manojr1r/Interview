package org.example;

import java.util.Arrays;

public class LTIMindTree {
public static void main(String[] args){
    int[] arra1 = {20,88,55,7,25};
    int[] arra2 = {90, 52, 5, 30 };

    int[] combinedArray = new int[arra1.length + arra2.length];
//    System.out.println("initiazati " + Arrays.toString(combinedArray));

    for (int j = 0;  j < arra1.length ;j++){
        combinedArray[j] = arra1[j];
//        System.out.println("for j ="+ j +" = " +Arrays.toString(combinedArray));
    }
//    System.out.println(Arrays.toString(combinedArray));

    for (int k = 0;  k < arra2.length ;k++){
        combinedArray[arra1.length + k] = arra2[k];
    }

    int highNumber = combinedArray[0];
    int secondHighNumber = combinedArray[0];

    // Step 1: find highest
    int highest = combinedArray[0];
    for (int i = 1; i < combinedArray.length; i++) {
        if (combinedArray[i] > highest) {
            highest = combinedArray[i];
        }
    }

// Step 2: find second highest
    int secondHighest = Integer.MIN_VALUE;
    for (int i = 0; i < combinedArray.length; i++) {
        if (combinedArray[i] != highest && combinedArray[i] > secondHighest) {
            secondHighest = combinedArray[i];
        }
    }

    for (int j : combinedArray) {
        if (j > highNumber) {
            secondHighNumber = highNumber;
            highNumber = j;
        } else if (j > secondHighNumber && j != highNumber) {
            secondHighNumber = j;
        }
    }

    System.out.println("highNumber = " + highNumber);
    System.out.println("secondHighNumber =" + secondHighNumber);
}
}
