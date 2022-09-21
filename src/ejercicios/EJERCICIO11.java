
package ejercicios;
//JHOSEP TS
//11. Programa que solicita ingresar un número favorito por teclado y luego el computador debe 

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EJERCICIO11 {

    public static void main(String[] args) {
           Scanner a1= new Scanner (System.in);
        String texto,textoSalida;
        
        texto=JOptionPane.showInputDialog(" tu numero favorito" );
        textoSalida="Tu número favorito es: "+texto;
        JOptionPane.showInternalMessageDialog(null, textoSalida);
    
    }
    
}
