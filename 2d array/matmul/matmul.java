//import java.io.*;
import java.util.*;

public class matmul{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr1 = new int[n1][m1];
    for (int i = 0 ; i < n1 ; i++){
      for (int j = 0 ; j <m1; j++){
        arr1[i][j] = scn.nextInt();
      }
    }
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n2][m2];
    for (int i = 0 ; i < n2 ; i++){
      for (int j = 0 ; j <m2; j++){
        arr2[i][j] = scn.nextInt();
      }
    }
    if(m1 == n2){
      int[][] pro = new int [n1][m2];
      for (int r = 0 ; r < pro.length; r++){
        for(int c = 0 ; c < pro[0].length; c++){
          for (int k = 0 ; k < m1; k++){
            pro[r][c] += arr1[r][k]*arr2[k][c];
          }
        }
      }
      for (int r = 0 ; r < pro.length; r++){
        for(int c = 0 ; c < pro[0].length; c++){
          System.out.print(pro[r][c]+" ");
        }
        System.out.println();
      }
    }
    else{
      System.out.println("Invalid input");
      return;
    }

    

 }

}