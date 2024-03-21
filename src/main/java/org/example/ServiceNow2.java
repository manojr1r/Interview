package org.example;

public class ServiceNow2 {
    // 72 seats
    //three
    public enum Berths { UPPER_SIDE, LOWER_LEFT ,MIDDLE_LEFT, UPPER_LEFT ,LOWER_RIGHT,MIDDLE_RIGHT, UPPER_RIGHT, LOWER_SIDE }

    public static void main(String[] args) {
        System.out.println(2 +" should be MIDDLE_LEFT = "+ findBerth(2));
        System.out.println(7 +" should be LOWER_SIDE = " +findBerth(7));
        System.out.println(8 +" should be UPPER_SIDE = "+  findBerth(8));
        System.out.println( findBerth(72));
    }
    public static Berths findBerth(int seatNo){
        if(seatNo > 0 && seatNo <= 72){
            int no =  seatNo % 8;
            return Berths.values()[no];
        }
        return null;
         
    }
}
