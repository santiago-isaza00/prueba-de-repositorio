
package com.mycompany.tallerconstruccion2;

import java.util.Scanner;


public class taller5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantFilas,cantColum;
        System.out.println("ingrese el numero de filas: ");
        cantFilas=leer.nextInt();
        System.out.println("ingrese el numero de columnas: ");
        cantColum=leer.nextInt();
        int[][] matriz=new int[cantFilas][cantColum];
        System.out.println("Dijite la matriz");
        for(int i=0; i<cantFilas; i++){

            for (int x=0; x<cantColum; x++){

                System.out.println("Ingrese el numero de la posicion ["+i+"]["+x+"]");

                matriz[i][x] = leer.nextInt();
                
            }
        }
        System.out.println("la matriz es: ");
        for(int i=0; i<cantFilas; i++){

            for (int x=0; x<cantColum; x++){
                System.out.print(matriz[i][x] + "|");
                
            }
              System.out.println("");  
        }
        int colmen=0,filmen=0;
        int menor=matriz[colmen][filmen];
        for(int i=0; i<cantFilas; i++){

            for (int x=0; x<cantColum; x++){
                if(matriz[i][x]<menor){
                    menor=matriz[i][x];
                    colmen=x;
                    filmen=i;
                    
                }
            }
        }  
        System.out.println("el numero menor es: "+menor+" y esta en la columna "+colmen+"y en la fila: "+filmen);
    }
    
}
