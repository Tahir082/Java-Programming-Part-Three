
package lab_prob17;

import static java.lang.Math.pow;
import java.util.Scanner;


class Complex{
    double realPart;
    double imaginaryPart;
    
    Complex(){
        this.realPart=0;
        this.imaginaryPart=0;
    }
    Complex(double realPart, double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    public void setComplex(double realPart, double imaginaryPart)
    {
        double r= realPart;
        double i=imaginaryPart;
        if(i<0){
            System.out.println("Answer: "+ String.format("%.2f", r)+" "+String.format("%.2f", i)+"i ");
        }
        else{
            System.out.println("Answer: "+ String.format("%.2f", r) +" + "+String.format("%.2f", i)+"i ");
        }
        
    }
    
    public void ComplexAdd(Complex otherNumber){
        double r_part;
        double i_part;
        r_part= this.realPart+ otherNumber.realPart;
        i_part= this.imaginaryPart+ otherNumber.imaginaryPart;
        setComplex(r_part, i_part);
    }
    public void ComplexSubtract(Complex otherNumber){
        double r_part;
        double i_part;
        r_part= this.realPart- otherNumber.realPart;
        i_part= this.imaginaryPart- otherNumber.imaginaryPart;
        setComplex(r_part, i_part);
    }
    public void ComplexMultiply(Complex otherNumber){
        double r_part;
        double i_part;
        r_part= (this.realPart * otherNumber.realPart) - (this.imaginaryPart*otherNumber.imaginaryPart);
        i_part= (this.realPart * otherNumber.realPart) + (this.imaginaryPart*otherNumber.imaginaryPart);
        setComplex(r_part, i_part);
    }
    public void ComplexDivide(Complex otherNumber){
        double r_part;
        double i_part;
        r_part= ((this.realPart* otherNumber.realPart)+ (this.imaginaryPart* otherNumber.imaginaryPart))/ (pow(otherNumber.realPart,2)+ pow(otherNumber.imaginaryPart,2));
        i_part= ((otherNumber.realPart* this.imaginaryPart)-(this.realPart* otherNumber.imaginaryPart))/ (pow(otherNumber.realPart,2)+pow(otherNumber.imaginaryPart,2));
        setComplex(r_part, i_part);
    }
    public void setRealPart(double realPart){
        this.realPart= realPart;
        
    }
    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart= imaginaryPart;
    }
    public double getRealPart(){
        return this.realPart;
    }
    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    public String toString(){
        double r= this.realPart;
        double i= this.imaginaryPart;
        String com= r+" + "+i+"i";
        return com;
    }
    
}

public class ComplexDemo{
    public static void main(String[] args) {
        Complex number, other_num;
        Scanner in= new Scanner(System.in);
        double real, img;
        System.out.println("Type a Complex Number");
        System.out.println("Type Real part: ");
        real= in.nextDouble();
        System.out.println("Type Imaginary Part");
        img= in.nextDouble();
        number= new Complex(real, img);
        System.out.println("You Typed 1st Complex Number:");
        System.out.println(number.toString());
        double real2, img2;
        System.out.println("Type another Complex Number");
        System.out.println("Type Real part: ");
        real2= in.nextDouble();
        System.out.println("Type Imaginary Part");
        img2= in.nextDouble();
        other_num= new Complex(real2, img2);
        System.out.println("You Typed 2nd Complex Number:");
        System.out.println(other_num.toString());
        
        System.out.println("Addition:");
        number.ComplexAdd(other_num);
        
        System.out.println("Subtraction:");
        number.ComplexSubtract(other_num);
        
        System.out.println("Multiplication:");
        number.ComplexMultiply(other_num);
        
        System.out.println("Division:");
        number.ComplexDivide(other_num);
        
        
    }
}


    

