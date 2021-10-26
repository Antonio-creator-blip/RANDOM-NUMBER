package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int numeri [] = new int[15];

        int max = 90;
        int min = 1;
        int z = 0;

        for (int i = 0; i < 15; i++) {
                int numero = (int)(Math.random() * ((max - min) + 1)) + min;
                for(int j = 0;j<numeri.length;j++){

                    if(numeri[j]==numero) {
                        z++;
                    }
                }
            if(z==0){
                numeri[i]=numero;
            }
            else{
                z=0;
                i=i-1;
            }
        }
        System.out.println(Arrays.toString(numeri));
    }
}
