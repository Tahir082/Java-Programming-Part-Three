
package lab_prob1;

import java.util.Scanner;

public class Lab_prob1 {

    
    public static void main(String[] args) {
        int temp;
        System.out.println("How many Numbers?");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Input the numbers:");
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        for(int j=0; j<n-1; j++){
            for(int i=0; i<n-j-1; i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int num: arr){
            System.out.print(num);
            System.out.print(" ");
        }
        
        
        
    }
    
}
