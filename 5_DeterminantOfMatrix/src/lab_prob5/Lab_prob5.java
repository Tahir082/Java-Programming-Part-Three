
package lab_prob5;

import java.util.Scanner;


public class Lab_prob5 {

    
    public static void main(String[] args) {
        int temp, sum=0;
        
        Scanner in= new Scanner(System.in);
        int n= 3;
        int m[][] = new int[n][n];
        System.out.println("Input 3X3 Square Matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m[i][j]=in.nextInt();
            }
        }
        int k=0;
        int det, det1, det2, det3;
        
        det1= m[0][0]*((m[1][1]*m[2][2])-(m[1][2]*m[2][1]));
        det2= -1*m[1][0]*((m[0][1]*m[2][2])-(m[2][1]*m[0][2]));
        det3= m[2][0]*((m[0][1]*m[1][2])-(m[0][2]*m[1][1]));
        
        det=det1+det2+det3;
        
        System.out.println("The Determinent of Given Matrix: " +det);
    }
    
}
