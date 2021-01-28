
package lab_prob13;

import java.util.Scanner;


public class Lab_prob13 {

    
    public static void main(String[] args) {
        int num; 
        System.out.println("Enter a Number: ");
        Scanner in= new Scanner(System.in);
        num= in.nextInt();
        int fact= factorial(num);
        System.out.println("Factorial of "+num+" Using Recursion Method, is: " + fact);
    }
    
    public static int factorial(int num){
        if(num>=1){
            return num*factorial(num-1);
        }
        else{
            return 1;
        }
    }
    
}
