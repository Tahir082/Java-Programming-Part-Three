
package lab_prob14;

import java.util.Scanner;


public class Lab_prob14 {

    
    public static void main(String[] args) {
        String str1, str2;
        int len1, len2;
        int count=0;
        boolean anagram = false;
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Enter a word: ");
            str1= in.next();
            System.out.println("Enter another word of same length: ");
            str2= in.next();
            len1= str1.length();
            len2= str2.length();
            if(len1!=len2){
            System.out.println("Type two words having same number of alphabets");
            }
            else{
                break;
            }
        }
        
        char s1[]= new char[len1];
        char s2[]= new char[len2];
        int ok[]=new int[len1];
        for(int a=0; a<len1; a++){
            ok[a]=0;
        }
        s1= str1.toCharArray();
        s2= str2.toCharArray();
        for(int i=0; i<len1; i++){
            char check= s1[i];
            for(int j=0; j<len2; j++){
                if(s2[j]==check){
                    ok[count]=1;
                    count++;
                }
                
            }
        }
        
        for(int k=0; k<len1; k++){
            anagram = ok[k]==1;
        }
        if(len1==len2 && anagram==true){
            System.out.println(str1+ "and "+str2+ " are Anagram!");
        }
        else{
            System.out.println(str1+ "and "+str2+ " are Not Anagram!");
        }
        
    }
    
}
