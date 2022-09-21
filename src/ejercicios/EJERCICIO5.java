
package ejercicios;
//JHOSEP TS
//5. Realizar un programa que calcule el promedio de 5 notas ingresadas por teclado. 
import java.util.Scanner;

public class EJERCICIO5 {

    public static void main(String[] args) {
      Scanner entrada=new Scanner (System.in);
        float nota1,nota2,nota3,nota4,nota5;
        float promedio;
        System.out.println("ingrese la primera nota"); 
        nota1=entrada.nextFloat();
        System.out.println("ingrese la segunda nota"); 
        nota2=entrada.nextFloat();
        System.out.println("ingrese la tercera nota"); 
        nota3=entrada.nextFloat();
        System.out.println("ingrese la cuarta nota"); 
        nota4=entrada.nextFloat();
        System.out.println("ingrese la quinta nota"); 
        nota5=entrada.nextFloat();
        promedio=(nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("el promedio es "+promedio+"");
    }
    
}
