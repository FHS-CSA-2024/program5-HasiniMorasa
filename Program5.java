//import stuff here?

//Your code here
//Your code here
public class Program5 {
    
   public static void main(String[] args){
//declare variables//
int miles1 = 286  ;
int gallon1 = 9 ;
int miles2 = 412;
int gallons2 = 40;
int miles3  = 361;
int gallons3 = 18;
int miles4 = 161;
int gallons4 = 11;
 
//declare milesperGallon and average(Calculate)//
double milesperGallon1 = (double)miles1/gallon1; 
double Royaeaverage = (double) Math.round((milesperGallon1 ) * 10) /10;  // 31.8
double milesperGallon2 = (double)miles2/gallons2;
double Koopaverage = (milesperGallon2);
double milesperGallon3 = (double) miles3/gallons3;
double Pipeaverage = (double) Math.round((milesperGallon3) * 10) /10; // 20.1     
double milesperGallon4 = (double)miles4/gallons4;
double Wagonaverage = (double) Math.round((milesperGallon4) * 10) /10;      
//rounding each output to the nearest tenth//      


//Output//
System.out.println("The Mushroom Cup Prix Racer Average Miles/Per Gallons");   
System.out.println("Royale averaged  " + Royaeaverage + " m/g");
System.out.println("Koopa King averaged " + Koopaverage + " m/g");
System.out.println("Piper Frame averaged " + Pipeaverage + " m/g");  
System.out.println("Badwagon averaged " + Wagonaverage + " m/g");        

  }
}
