package numerosamigos2;
import java.util.Scanner;

public class NumerosAmigos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero natural");
        int numero1 = 6232;

        
        System.out.println("Ingrese el segundo numero natural");
        int numero2 = 6368;
        
        int suma1 = 0;
        int suma2 = 0;
        long tiempoI = System.nanoTime();
        
        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                System.out.println(i);
                 suma1 = suma1 + i;
            }
        }
        System.out.println("la suma es "+suma1);
        
        for (int m = 1; m < numero2; m++) {
            if (numero2 % m == 0) {
                System.out.println(m);
                 suma2 = suma2 + m;
            }
        }
        System.out.println("la suma es "+suma2);
        
        long tiempoF = System.nanoTime();
        
        long tiempoFinal = tiempoF - tiempoI; 
        System.out.println(tiempoFinal);
    }
    
}
