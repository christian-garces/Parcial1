/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

/**
 *
 * @author chris
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada;
        int opcion;
        int numero, suma=0, i;
         
        System.out.println("Programa que detecta los siguientes tipos de numero: ");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abudante");
        System.out.println("Seleccione su opción 1, 2 0 3:");
        
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);
        System.out.println("--------------------------------------------------");
        
        System.out.println("Escriba el numero: ");
        entrada = bufer.readLine();
        numero = Integer.parseInt(entrada);
        
        switch ( opcion ){
            
            case 1:{
                for (i = numero-1; i>=1; i--)
                    if(numero%i == 0)
                        suma += i;
                if (numero == suma)
                    System.out.println (" El numero: " +  numero + "es perfecto");
                else 
                    System.out.println (" El numero: " +  numero + "No es perfecto");
            }
            break;
            case 2:{
                for (i = numero-1; i>=1; i--)
                    if(numero%i == 0)
                        suma += i;
                if (numero > suma)
                    System.out.println (" El numero: " +  numero + "es defectivo");
                else 
                    System.out.println (" El numero: " +  numero + "No es defectivo");
            }
            break;
            case 3:{
                for (i = numero-1; i>=1; i--)
                    if(numero%i == 0)
                        suma += i;
                if (numero > 2 * suma)
                    System.out.println (" El numero: " +  numero + "es abundante");
                else 
                    System.out.println (" El numero: " +  numero + "No es abundante");
            }
            break;
            default: System.out.println("Opcion no valida");
        }
  
    }
}
