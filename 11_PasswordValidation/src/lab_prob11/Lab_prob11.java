/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob11;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab_prob11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            int flag=0, digcount=0;
            System.out.println("Enter a password: ");
            Scanner in= new Scanner(System.in);
            String pass= in.nextLine();
            int p_len= pass.length();
            if(p_len<10){
                System.out.println("Password is too short! Your Password should have atleast 10 characters!!");
            }
            else if(p_len>10){
   
                char password[]= new char[p_len];
                password= pass.toCharArray();
                for(int i=0; i<p_len; i++){
                    char ch;
                    ch= pass.charAt(i);
                    if(ch >= 'a' && ch <= 'z' && ch >= 'A' && ch <= 'Z' && ch >= '0' && ch <= '9') {
                        flag=0;
                    } 
                    else if(ch >= '0' && ch <= '9'){
                        digcount++;
                        flag=0;
                    }
                    else{
                        flag=1;
                        
                    }
   
                }
                if(flag==1 || digcount<2){
                    System.out.println("The Password should contain some letters and at least two Digits. Try Again!!");
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
            
            
        }
       System.out.println("System has accepted the Password Successfully"); 
    }
    
}
