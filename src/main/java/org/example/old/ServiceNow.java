package org.example.old;

import java.util.Arrays;
public class ServiceNow {
    public static void main(String[] args) {
        int[] no = new int[]{0, 1, 0, 0, 1, 1, 0};
        System.out.println(Arrays.toString(onestoRight(no)));
    }

    public static int[] onestoRight(int[] arr){
        //approach 1

//        Arrays.sort(arr , Comparator.reverseOrder());

//        //approach 2
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] == 0 && arr[i + 1] == 1) {
//                // Swap the elements to shift 1 to the right
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//                // Move the index back one step to recheck the swapped element
//                if (i > 0) {
//                    i -= 2;
//                }
//            }
//        }
//
//        //approach 3

//        int count = 0; // Count of 1s in the array
//
//        for (int i : arr) {
//            if (i == 1) {
//                count++;
//            }
//        }
//        // Set 1s to the right
//        for (int i = n - 1; i >= 0; i--) {
//            if (count > 0) {
//                arr[i] = 1;
//                count--;
//
//            } else {
//                arr[i] = 0;
//            }
//        }
//
        //approach 4
        int one = 0;

        for (int integer : arr) {

            if (integer == 1) {
                one++;
            }
        }

        arr = new int[arr.length];

        for (int i = (arr.length -1) ; i >= one  ; i--) {
            arr[i] = 1;
        }
        return arr;
    }
}
