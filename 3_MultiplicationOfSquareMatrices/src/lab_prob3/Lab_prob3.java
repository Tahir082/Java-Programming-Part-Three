
package lab_prob3;

import java.util.Scanner;


public class Lab_prob3 {

    
    public static void main(String[] args) {
        int temp, sum=0;
        System.out.println("How many columns and rows?");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int matrix_1[][] = new int[n][n];
        int matrix_2[][] = new int[n][n];
        int mul[][] = new int[n][n];
        System.out.println("Input 1st Square Matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix_1[i][j]=in.nextInt();
            }
        }
        System.out.println("Input 2nd Square Matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix_2[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               for(int k=0; k<n; k++){
                   sum=sum + matrix_1[i][k]*matrix_2[k][j];
               }
               mul[i][j]= sum;
               sum=0;
            }
        }
        
        System.out.println("Multiplication of Given Square Matrices: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mul[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
