package org.example;

import com.sun.tools.javac.Main;

public class ServiceNow2 {
    // 72 seats
    //three
    public enum Berths { LOWER_LEFT ,MIDDLE_LEFT, UPPER_LEFT ,LOWER_RIGHT,MIDDLE_RIGHT, UPPER_RIGHT, LOWER_SIDE, UPPER_SIDE }

    public static void main(String[] args) {

    }
    public static void findBerth(int seatNo){
        if(seatNo > 0 && seatNo < 72){
            int no =  seatNo % 8;

        }
         
    }
}
