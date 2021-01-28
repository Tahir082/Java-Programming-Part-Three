
package lab_prob2;

import java.util.Scanner;


public class Lab_prob2 {

    
    public static void main(String[] args) {
        int n, temp;
        System.out.println("How many Numbers?");
        Scanner in= new Scanner(System.in);
        while(true)
        {
            n= in.nextInt();
            if(n<9999){
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
            System.out.println("Second Smallest Number in the Array: "); 
            System.out.print(arr[1]);
            }
            else{
                System.out.println("Invalid Inpur!!!! Try Again");
            }
        }
        
        
        
    }
    
}
