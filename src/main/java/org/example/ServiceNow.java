package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ServiceNow {
    public static void main(String[] args) {
        Integer[] no = new Integer[]{0,1 ,0,0,1,1,0,};
        System.out.println(filterno(no));

    }

    public static int filterno(Integer[] numbers){
        int one = 0;
        for (int i = 0; i < (numbers.length ) ; i++) {
            if(numbers[i] == 1){
                one++;
            }
        }
        return one;
    }
}
