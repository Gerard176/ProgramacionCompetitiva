package com.mycompany.maratondeprogramacionj;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * Dado un arreglo de números, implementar una función de 
 * ordenamiento por inserción que ordene los elementos en orden creciente.
 */
public class OrdenarArrayPorInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {30,15,2,21,44,8};
        Ordenar(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
        
    }

    private static int[] Ordenar(int[] array) {
        int aux,j;
        for (int i = 1; i < array.length; i++) {
             aux = array[i];
             j = i-1;
            while (j>=0 && aux<array[j]) {                
                array[j+1] = array[j];
                j--;
            }
            array[j+1]= aux;
        }
        
        return array;
    }
    
    
}
