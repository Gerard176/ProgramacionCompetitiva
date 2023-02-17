/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.maratondeprogramacionj;

/**Dado un arreglo de números, 
 * implementar una función de búsqueda binaria que encuentre un elemento en el arreglo.
 *
 * 
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int numero = 10;
        System.out.println(BinarySearch(array,numero));
        
    }

    private static int BinarySearch(int array[],int numero) {
        int left = 0;
        int right = array.length;
        while (left <= right) {            
            int mid = (left+right)/2;
            if (array[mid]==numero) {
                return mid;
            }else if (array[mid]< numero) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
 
    }
    
 
