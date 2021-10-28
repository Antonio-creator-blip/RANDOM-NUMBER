package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeri = new ArrayList<Integer>();
        Random random = new Random();

        int max = 90;
        int min = 1;
        int z = 0;
        int somma = 0;

        for (int i = 0; i < 15; i++) {
                int numero = random.nextInt(90);
                for(int j = 0;j<numeri.size();j++){

                    if(numeri.get(j) ==numero) {
                        z++;
                    }
                }
            if(z==0){
                numeri.add(numero);
                somma = somma + numero;
            }
            else{
                z=0;
                i=i-1;
            }
        }
        System.out.println(numeri);
        System.out.println("Media: " + somma/ 15);
    }
}
