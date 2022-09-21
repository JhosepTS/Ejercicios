
package ejercicios;
//JHOSEP TS
//9. Calcular la suma de las áreas de 3 círculos cuyos radios son 8.9, 6.7 y 7.9
public class EJERCICIO9 {
    public static void main(String[] args) {
   double pi = 3.14159265;
        double r1 = 8.9;
        double r2 = 6.7;
        double r3 = 7.9;
        double A1 = pi * r1 * r1;
        double  A2 = pi * r2 * r2;
        double  A3 = pi * r3 * r3;
        System.out.println("El area del circulo es : " + A1);
        System.out.println("El area del circulo es : " + A2);
        System.out.println("El area del circulo es : " + A3);
        System.out.println("La Suma de las Areas es : " + (A1+A2+A3));
    }
    
}
