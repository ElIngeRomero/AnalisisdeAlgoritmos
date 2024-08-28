package RandomUti;

import java.util.Random;

public class RandomUti {

    public static void main(String[] args) {
        int m = 15000;
        int[][] numeros = new int[m][m];

        Random num = new Random();
        long tiempoI = System.currentTimeMillis();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = num.nextInt(100);
            }
        }
        long tiempoF = System.currentTimeMillis();
        
        long tiempoFinal = tiempoF - tiempoI; 
        System.out.println(tiempoFinal);
        
//        for (int i = 0; i < numeros.length; i++) {
//            for (int j = 0; j < numeros[i].length; j++) {
//                System.out.print(numeros[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
