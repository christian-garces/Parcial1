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
public class Main {

    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Ingrese un número: "));
        NumerosRefactorizados num = new NumerosRefactorizados(numero);
        System.out.println("El número " + numero + "  es " + num.getTipo());
    }
}
