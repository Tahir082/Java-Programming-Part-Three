
package lab_prob9;

import java.util.Scanner;


public class Lab_prob9 {

    
    public static void main(String[] args) {
        System.out.println("Type a Number");
        Scanner in= new Scanner(System.in);
        int j;
        int n= in.nextInt();
        int sum=0;
        for(j=1; j<=n; j++){
            sum= sum+ (fact(j)/j);
        }
        System.out.println("1!/1 + 2!/2 + 3!/3+.....+n!/n = " +sum);
        
    }
    
    public static int fact(int n){
        int i;
        int result=1;
        for(i=1; i<=n; i++){
            result= result*i;
        }
        return result;
    }
    
}
