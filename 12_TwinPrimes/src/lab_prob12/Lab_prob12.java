package lab_prob12;


public class Lab_prob12 {

    
    public static void main(String[] args) {
        
        int n = 0;
        System.out.println("All twin prime numbers, less than 100");
        for(int p=2; p<100; p++){
            if(prime(p)==true && prime(p+2)==true){
                System.out.println("("+p+","+(p+2)+")");
            }
        }
    
    }
        
    public static boolean prime(int p){    
        for(int i = 2; i < p; i++)
        {
            if(p % i == 0){
                return false;
            }
        }
        return true;
        
    }
    
}
