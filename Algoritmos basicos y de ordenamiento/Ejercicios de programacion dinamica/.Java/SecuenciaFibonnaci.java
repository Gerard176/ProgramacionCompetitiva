/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionDinamica;

import java.util.Scanner;

/**
 *  
 * 
 */
public class SecuenciaFibonnaci {

    /**
     * .Fibonacci: Es un clásico de programación dinámica. El problema consiste en encontrar el n-ésimo 
        número de la secuencia de Fibonacci, donde cada número es la suma de los dos anteriores 
        (los primeros dos números son 0 y 1). Por ejemplo, el octavo número de Fibonacci es 21.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
           c = a+b;
           a = b;
           b = c;
           
        }
        System.out.println(a);
    }
    
}
