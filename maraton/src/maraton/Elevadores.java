/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maraton;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevadores {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    int vector[] = new int[m];
    
    
      for (int k = 0; k < m; k++) {
          vector[k] = Integer.parseInt(br.readLine());
          
      }
      
      for (int k = 1; k <=n; k++) {
          System.out.println(piso(k, m, n, vector));
      }
            
      }
   
     public static int piso(int i,int m,int n,int[] vector){
        int piso = 0;
        int j = -1;
        while (j<m-1) {          
          j++;  
            while (i<=n && i>0) {                
              if (vector[j] == i) {
                  break;
              }else if (vector[j] == i-1) {
                  i=i-2;
                  break;
              }
              else{
                  i--;
                  break;
              }

            }
            i++;
            piso = i;
      }
        return i;        
    }

    

  }

