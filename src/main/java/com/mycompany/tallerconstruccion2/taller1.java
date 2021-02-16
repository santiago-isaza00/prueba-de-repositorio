
package com.mycompany.tallerconstruccion2;


import javax.swing.JOptionPane;


public class taller1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int edad;
        do {            
            
            edad = Integer.parseInt(JOptionPane.showInputDialog("Bienvenid@ ingrese una edad valida entre 1-100 \n o ingrese 0 en cualquier momento para salir" ));
            if (edad!=0 && edad<=12){
                JOptionPane.showMessageDialog(null,"la edad ingresada pertenece a un NIÑO" );
            }
            if(edad>13 && edad<=28){
                JOptionPane.showMessageDialog(null,"la edad ingresada pertenece a un JOVEN" );
            } 
            if(edad>28 && edad<=55){
                JOptionPane.showMessageDialog(null,"la edad ingresada pertenece a un ADULTO" );
            } 
            if(edad>55 && edad<=100){
                JOptionPane.showMessageDialog(null,"la edad ingresada pertenece a un ADULTO MAYOR" );
            } 
            else if(edad<0 || edad>100) 
                JOptionPane.showMessageDialog(null,"la edad ingresada no es valida intente nuevamente" );  
        }
            while (edad!=0);
        
           
       }
       
           
    }
    

