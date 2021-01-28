
package lab_prob16;

import java.util.Scanner;

class Clock{
    private int hour;
    private int min;
    private int second;
    Clock(){
        this.hour=12;
        this.min=0;
        this.second=0;
        System.out.println("Clock is Created");
    }
    Clock(int hours, int minutes, int seconds){
        this.hour=hours;
        this.min=minutes;
        this.second=seconds;
        System.out.println("Clock is Created______2");
    }
    Clock(int seconds){
        int h, m, s, sec;
        sec=seconds;
        h=sec/3600;
        sec= sec%3600;
        this.hour=h;
        m= sec/60;
        sec=sec%60;
        this.min=m;
        s=sec;
        this.second=s;      
        System.out.println("Clock is Created");
    }
    public void setTime(int seconds){
        int h, m, s, sec;
        sec=seconds;
        h=sec/3600;
        sec= sec%3600;
        this.hour=h;
        m= sec/60;
        sec=sec%60;
        this.min=m;
        s=sec;
        this.second=s;      
        System.out.println("Clock is Created");
    }
    
    int setClock(int h, int m, int s){
       int seconds;
       seconds= (h*3600)+ (m*60)+ s;
       return seconds;
    }
    void setHours(int hours){
        this.hour=hours;
    }
    void setMinutes(int mins){
        this.min=mins;
    }
    void setSeconds(int seconds){
        this.second=seconds;
    }
    int getHours(){
        return this.hour;
    }
    int getMinutes(){
        return this.min;
    }
    int getSeconds(){
        return this.second;
    }
    
    void tick(){
        
        for(int i=1; i<=10; i++){
            
            this.second++;
            if(this.second>59){
                this.second=0;
                this.min++;
                if(this.min>59){
                    this.min=0;
                    this.hour++;
                    if(this.hour>23){
                        this.hour=0;  
                    }
                
                }
            }
            
            
            
                System.out.println("Tick "+i+"= "+ this.hour+":" +this.min+":"+this.second);
            
        }
    }
    public void addClock(Clock f, Clock s)
    {
       int f_clock= f.hour*3600 + f.min*60 + f.second;      
       int s_clock= s.hour*3600 + s.min*60 + s.second;         
       setTime(f_clock + s_clock);
        
    }
    public void subtractClock(Clock f, Clock s)
    {
        int f_clock= f.hour*3600 + f.min*60 + f.second;
        int s_clock=s.hour*3600 + s.min*60 + s.second; 
        int ret_sec= f_clock- s_clock;
        if(ret_sec<0){
            ret_sec = 86400+ ret_sec;
            setTime(ret_sec);
        }
        else{
            setTime(ret_sec);
        }
        
    }
    
    public String to_String(){
        String time=this.hour+": "+this.min+": "+this.second+" (HH: MM: SS)";
        return time;
    }
     
}
public class ClockDemo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int seconds;
        System.out.println("Type a time since midnight in Seconds to initialize First Clock: ");
        seconds= in.nextInt();
        Clock firstClock, secondClock;
        firstClock= new Clock(seconds);
        int hr, min, sec;
        hr= firstClock.getHours();
        min= firstClock.getMinutes();
        sec= firstClock.getSeconds();
        firstClock.setHours(hr);
        firstClock.setMinutes(min);
        firstClock.setSeconds(sec);
        System.out.println("1st Clock Initialized= "+hr+":" +min+ ":"+sec);
        firstClock.tick();
        System.out.print("First Clock Ended with: ");
        System.out.println(firstClock.to_String());
        System.out.println("Initialize 2nd Clock: ");
        System.out.println("Hour: ");
        int hour= in.nextInt();
        System.out.println("Minutes: ");
        int minute= in.nextInt();
        System.out.println("Seconds: ");
        int second= in.nextInt();
        secondClock= new Clock(hour, minute, second);
        int hr2, min2, sec2;
        hr2= secondClock.getHours();
        min2= secondClock.getMinutes();
        sec2= secondClock.getSeconds();
        secondClock.setHours(hour);
        secondClock.setMinutes(minute);
        secondClock.setSeconds(second);
        System.out.println(" 2nd Clock Initialized= "+hr2+":" +min2+ ":"+sec2);
        secondClock.tick();
        System.out.print("2nd Clock Ended with: ");
        System.out.println(secondClock.to_String());
        secondClock.setClock(hr2, min2, sec2);
        System.out.println("Adding First and Second Clock: ");
        Clock thirdClock = new Clock();
        thirdClock.addClock(firstClock, secondClock);
        System.out.println(thirdClock.to_String());
        System.out.println("Subtracting First and Second Clock: ");
        thirdClock.subtractClock(firstClock, secondClock);
        System.out.println(thirdClock.to_String());
        
        
        
    }
    
}


