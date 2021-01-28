
package lab_prob10;

import static java.lang.Math.pow;
import java.util.Scanner;


public class Lab_prob10 {

    
    public static void main(String[] args) {
        
        System.out.println("Type in a Number: ");
        Scanner in= new Scanner(System.in);
        int arr[]= new int[10];
        int n= in.nextInt();
        int arm=0, per=0, i=0, digcount=0;
        int num=n;
        while(num!=0){
            int d=num%10;
            arr[i]=d;
            i++;
            digcount++;
            num=num/10;
        }
        for(int j=0; j<digcount; j++){
            arm= (int) (arm+ pow(arr[j], digcount));
        }
        
        if(arm==n){
            System.out.println(n+ " is an Armstrong number");
        }
        else{
            System.out.println(n+ " is NOT an Armstrong number");
        }
        int arr2[]= new int [10];
        num=n;
        digcount=0;
        int p=0;
        for(int k=1; k<num; k++)
        {
            if(num%k==0){
                arr2[p]=k;
                p++;
                digcount++;
            }
        }
        for(int j=0; j<digcount; j++){
            per= per+arr2[j];
        }
        if(per==n){
            System.out.println(n+ " is a Perfect number");
        }
        else{
            System.out.println(n+ " is NOT a Perfect number");
        }
        
    }
    
}
