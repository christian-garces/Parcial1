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
public class NumerosRefactorizados {
    
    private int numero;
    private int tipo;

    public NumerosRefactorizados(int numero) {
        this.numero = numero;
        calcularTipo();
    }

    private void calcularTipo() {
        int suma = 1;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                suma += i + numero / i;
            }
        }
        if (suma == numero) {
            tipo = 1;
        } else if (suma < numero) {
            tipo = 2;
        } else {
            tipo = 3;
        }
    }

    public boolean esPerfecto() {
        return tipo == 1;
    }

    public boolean esDeficiente() {
        return tipo == 2;
    }

    public boolean esAbundante() {
        return tipo == 3;
    }

    public String getTipo() {
        switch (tipo) {
            case 1:
                return "perfecto ";
            case 2:
                return "deficiente ";
            default:
                return "abundante ";
            }
        }
    }

