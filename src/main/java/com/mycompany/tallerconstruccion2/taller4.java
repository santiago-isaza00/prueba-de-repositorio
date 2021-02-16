
package com.mycompany.tallerconstruccion2;

import javax.swing.JOptionPane;

public class taller4 {
    public static void main(String[] args) {
        int cantNum, contIgual = 0, contMen = 0, contMay = 0;
        cantNum = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de numeros a evaluar"));
        int[] num = new int[cantNum];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero " + (i + 1)));
            if (num[i] == 0) {
                contIgual++;
            }
            if (num[i] < 0) {
                contMen++;
            }
            if (num[i] > 0) {
                contMay++;
            }

        }
        System.out.println("La cant de numeros mayores a 0 es: " + contMay + "\n La cant de numeros menores a o es: " + contMen + "\n a cant de numeros iguales a 0 es: " + contIgual);;

    }
    
}
