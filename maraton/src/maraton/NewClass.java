/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maraton;


import java.util.Scanner;

public class NewClass {
  public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      int m=0,n=0,k=0,cv=0,ch=0;
      
      m = sc.nextInt();
      n = sc.nextInt();
      String matriz[][] = new String[m][n];     
      
     
         for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              matriz[i][j] = sc.next();
          }

      }
         System.out.println("hola");
      k = sc.nextInt();
      char vector[] = new char[k];
      for (int t = 0; t < k; t++) {
        vector[t] = sc.next().charAt(0);
          System.out.println("hola");
        if(vector[t] == 'V'){
          cv++;
            
        }else if(vector[t] == 'H'){
          ch++;
        } 
      }
      System.out.println("numero de vs"+cv);
      System.out.println("numero de hs"+ch);
      
      if (cv % 2 == 0 && ch % 2 == 0) {
          System.out.println("primera");
          for (int i = 0; i < m; i++) {
              for (int j = 0; j < n; j++) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
      } else if (cv % 2 != 0 && ch % 2 != 0) {
          System.out.println("segunda");
          for (int i = m - 1; i >= 0; i--) {
              for (int j = n - 1; j >= 0; j--) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
      } else if (cv % 2 == 0 && ch % 2 != 0) {
          System.out.println("tercera");
          for (int i = 0; i < m; i++) {
              for (int j = n - 1; j >= 0; j--) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
      } else if (cv % 2 != 0 && ch % 2 == 0) {
          System.out.println("cuarta");
          for (int i = m - 1; i >= 0; i--) {
              
              for (int j = 0; j < n; j++) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
      }

//        if (cv % 2 == 0 && ch % 2 == 0) {
//            System.out.println("primera");
//            for (int i = 0; i > m; i++) {
//                
//              for (int j = 0; j > n; j++) {
//                  System.out.print(matriz[i][j] + " ");
//              }
//              System.out.println();
//          }
//        if(cv % 2 != 0 && ch % 2 != 0){
//            System.out.println("segunda");
//          for (int i = m - 1; i >= 0; i--) {
//              for (int j = n - 1; j >= 0; j--) {
//                  System.out.print(matriz[i][j] + " ");
//              }
//              System.out.println();
//          }
//        }
//        if(cv % 2 == 0 && ch % 2 != 0) {
//            System.out.println("tercera");
//            for (int i = 0; i > m; i++) {
//              for (int j = n - 1; j >= 0; j--) {
//                  System.out.print(matriz[i][j] + " ");
//              }
//              System.out.println();
//          }
//        }
//        if(cv % 2 != 0 && ch % 2 == 0){
//            System.out.println("cuarta");
//            for (int i = m-1; i >=0; i--) {
//                System.out.println("lol?");
//                for (int j = 0; j > n; j++) {
//                        System.out.print(matriz[i][j] + " ");
//                    }
//                System.out.println();
//            }

      
  }
            }
        
  

  
