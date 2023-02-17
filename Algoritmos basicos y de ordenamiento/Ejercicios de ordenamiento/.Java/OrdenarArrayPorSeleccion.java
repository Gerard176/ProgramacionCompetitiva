/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.maratondeprogramacionj;

/**
 *
 * Dado un arreglo de números, 
 * implementar una función de ordenamiento por selección que ordene los elementos en orden creciente.
 */
public class OrdenarArrayPorSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[]={2,5,6,7,8,4,1,9,3};
        Ordenar(array);
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static int[] Ordenar(int array[]){
        
        for (int i = 0; i < array.length-1  ; i++) { 
            for (int j = i+1; j <array.length; j++) {
                if (array[i]>array[j]) {
                    int temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
            
        }
    return array;
    }
}