
package lab_prob4;

import java.util.Scanner;


public class Lab_prob4 {

    
    public static void main(String[] args) {
        int temp, sum=0;
        System.out.println("How many columns and rows?");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Input 1st Square Matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=in.nextInt();
            }
        }
        int k=0;
        for(int i=0; i<n; i++){
            for(int j=k; j<=i; j++){
                sum= sum+ matrix[i][j];
                k++;
            }
        }
        
        System.out.println("The sum of Right Diagonal of the Given Matrix: " +sum);
    }
    
}
