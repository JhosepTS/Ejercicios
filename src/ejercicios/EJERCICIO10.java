
package ejercicios;
//JHOSEP TS
//10. Calcular la suma de las áreas de 8 círculos cuyos radios son 18.9, 16.7, 71.9, 4.6, 6.7, 5.6. 
//4.7y 10.

public class EJERCICIO10 {

    public static void main(String[] args) {
          double sumacir;
     double c1=18.9;
        double c2=16.7;
        double c3=71.9;
        double c4=4.6;
        double c5=6.7;
        double c6=5.6;
        double c7=4.7;
        double c8=10;
        double a=3.14*c1*c1;
        double b=3.14*c2*c2;
        double c=3.14*c3*c3;
        double d=3.14*c4*c4;
        double e=3.14*c5*c5;
        double f=3.14*c6*c6;
        double g=3.14*c7*c7;
        double h=3.14*c8*c8;
        System.out.println("El radio de el circulo 1 es:"+c1);
        System.out.println("El radio de el circulo 2 es:"+c2);
        System.out.println("El radio de el circulo 3 es:"+c3);
        System.out.println("El radio de el circulo 4 es:"+c4);
        System.out.println("El radio de el circulo 5 es:"+c5);
        System.out.println("El radio de el circulo 6 es:"+c6);
        System.out.println("El radio de el circulo 7 es:"+c7);
        System.out.println("El radio de el circulo 8 es:"+c8);
        
        System.out.println("El area de el circulo 1 es:"+a);
        System.out.println("El area de el circulo 2 es:"+b);
        System.out.println("El area de el circulo 3 es:"+c);
        System.out.println("El area de el circulo 4 es:"+d);
        System.out.println("El area de el circulo 5 es:"+e);
        System.out.println("El area de el circulo 6 es:"+f);
        System.out.println("El area de el circulo 7 es:"+g);
        System.out.println("El area de el circulo 8 es:"+h);
        
        sumacir=a+b+c+d+e+f+g;
        System.out.println("la suma de las 8 áreas de los circulos es: "+sumacir);
    }
    
}
