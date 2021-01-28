
package lab_prob15;


public class Lab_prob15 {
    private static int count = 0;
    private int x;
    public Lab_prob15(int i){
        x = i;
    }
    public void incrementCount()
    {
        count++;
    }
    public void printX(){
        System.out.println("Value of x : " + x);
    }
    public void setX(int x){
        this.x=x;
    }
    public static void printCount(){
        System.out.println("Value of count : " + count);
    }
    public static void main(String[] args) {
        Lab_prob15 myObject1 = new Lab_prob15(5);
        Lab_prob15 myObject2 = new Lab_prob15(7);
        myObject1.printX();
        myObject1.incrementCount();
        myObject1.printCount();
        myObject2.printCount();
        myObject2.printX();
        myObject1.setX(14);
        myObject1.incrementCount();
        myObject1.printX();
        myObject1.printCount();
        myObject2.printCount();
    }

    

    
}

