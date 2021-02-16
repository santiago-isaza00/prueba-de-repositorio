
package com.mycompany.tallerconstruccion2;

import javax.swing.JOptionPane;

public class taller3 {
    public static void main(String[] args) {
        int numeros=0;
        for(int i=0;i<=10;i++){
            numeros=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero mayor o igual a 0" )); 
        }
        JOptionPane.showMessageDialog(null,numeros );
        
        
    }
    
}
