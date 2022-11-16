/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fer33
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada =new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int edad;
        double costokilovatio;
        double kilovationumero;
        double costoplanilla;
        double descuento = 10;
        double valordescuento;
        
        System.out.println("Ingrese la edad del usuario");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el costo kilovatio/hora");
        costokilovatio = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de kilovatios consumidos"
                + "en el mes");
        kilovationumero = entrada.nextDouble();
        
        costoplanilla = costokilovatio * kilovationumero;
        
        if(edad > 65) {
            valordescuento = (costoplanilla * descuento) / 100;
            costoplanilla = (costoplanilla - valordescuento);
          
        
    }
        System.out.printf("El valor a cancelar es:" +costoplanilla);
    
    }
    
}
