
package lab_prob6;

import java.util.Scanner;


public class Lab_prob6 {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String word[]= new String[100]; 
        System.out.println("Type a sentence:");
        String str= in.nextLine();
        str= str+" ";
        System.out.println("Type a word to search");
        String test= in.nextLine();
        int str_len= str.length();
        int test_len= str.length();
        int freq=0, i, j, wc=0, count=0;
        String c="";
        
        for(i=0; i<str_len; i++){
            if(str.charAt(i)!= ' '){
                c= c+str.charAt(i);
            }
            else{
                word[wc]=c;
                wc++;
                c="";
            }
        }
        for(j=0; j<wc; j++){
            if(word[j].equals(test)){
                count++;
            }
        }
           System.out.println("The Test String occured for "+count+ " times in given sentence");
    }
    
}
