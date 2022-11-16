/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fer33
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorpedido;
        double cantidadnecesita;
        double preciounidad = 0;
        double descuento = 20;
        double valordescuento;
        
        System.out.println("Ingrese la cantidad que necesita");
        cantidadnecesita = entrada.nextDouble();
        
        System.out.println("Ingrese el precio por unidad");
        preciounidad = entrada.nextDouble();
        
        valorpedido = (cantidadnecesita * preciounidad);
        
        if(cantidadnecesita > 50){
            
            valordescuento = (valorpedido * descuento) / 100;
            
            valorpedido = (valorpedido - valordescuento);
            
        }
        
        System.out.printf("El valor del pedido es:" +valorpedido);
    
    
    
    
    
    
    
    
    
    
    }
    
}
