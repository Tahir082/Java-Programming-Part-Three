
package lab_prob7;

import java.util.Scanner;


public class Lab_prob7 {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Type a sentence:");
        String str= in.nextLine();
        str= str+" ";
        String word[]= new String[100]; 
        int str_len= str.length();
        String c = null, smallest;
        int i, j, k=0;
        for(i=0; i<str_len; i++){
            if(str.charAt(i)!= ' '){
                c= c+str.charAt(i);
            }
            else{
                word[k]=c;
                k++;
                c= "";
            }
        }
        
        smallest=word[0];
        for(int p=0; p<k; p++){
            if(smallest.length()> word[p].length()){
                smallest=word[p];
            }
        }
        
        System.out.println("Smallest Word in Given String: "+smallest);
    }
}
