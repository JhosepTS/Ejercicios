
package ejercicios;
//JHOSEP TS
//7. Realizar un programa que permita ingresar 10 números por teclado, el programa debe 
//calcular la multiplicación entre la suma de los primeros 5 números y la suma de los 5 últimos 
//números. 
import java.util.Scanner;

public class EJERCICIO7 {

    public static void main(String[] args) {
      System.out.println("Ingrese 10 números");
        Scanner sc = new Scanner(System.in);
        int Suma1 = 0;
        int Suma2 = 0;
        for (int i = 0; i < 10; i++) {
            int ni = sc.nextInt();
            if (i < 5) {
                Suma1 = Suma1 + ni;
            } else {
                Suma2 = Suma2 + ni;
            }
        }
        System.out.println("La sumana de los 5 primeros números es : " + Suma1 );
        System.out.println("La sumana de los 5 ultimos números es : " + Suma2 );
        System.out.println("El producto es : " + (Suma1 * Suma2) );
    }
    
}
