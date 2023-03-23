/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maraton;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vueltas {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
      int m=0,n=0,k=0,cv=0,ch=0;
      

      m = Integer.parseInt(br.readLine());
      n = Integer.parseInt(br.readLine());
      String matriz[][] = new String[m][n];     
      String vector[] = new String[k];
     
         for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              matriz[i][j] = br.readLine();
          }

      }
      
      for (int t = 0; t < k; t++) {
        vector[t] = br.readLine();
        if(vector[t] == "V"){
          cv++;
        }else if(vector[t] == "H"){
          ch++;
        } 
      }
      
     
  
        if (cv % 2 == 0 && ch % 2 == 0) {
            for (int i = 0; i > m; i++) {
              for (int j = 0; j > n; j++) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
        }else{
          for (int i = m - 1; i >= 0; i--) {
              for (int j = n - 1; j >= 0; j--) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
        if(cv % 2 == 0 && ch % 2 != 0) {
            for (int i = 0; i > m; i++) {
              for (int j = n - 1; j >= 0; j--) {
                  System.out.print(matriz[i][j] + " ");
              }
              System.out.println();
          }
        }else{
            for (int i = m-1; i >=0; i--) {
                for (int j = 0; j > n; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                System.out.println();
            }

      
  }
            }
        }
    }
