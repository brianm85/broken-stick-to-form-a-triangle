import java.util.Arrays;  
import java.util.Random;  
  
public class BrokenStick {  
  
   public static void main(String[] args) {  
       Random random = new Random();  
  
       int trials = 1000000;  //monte carlo
       int triangles = 0;  //count
  
       double[] breaks = new double[2]; //array for breaks 
       double[] sides = new double[3];  //array for sides
  
       for( int i=0; i < trials; ++i )  //loop
       {  
           breaks[0] = random.nextDouble();  //random break
           breaks[1] = random.nextDouble();  //second brake
           Arrays.sort(breaks);  //sort
  
           sides[0] = breaks[0];  //side of triangle
           sides[1] = breaks[1] - breaks[0];  //second side
           sides[2] = 1.0 - breaks[1];  //third side
           Arrays.sort(sides);  //sort
            
           if( sides[2] < (sides[0] + sides[1]) )  //check
           {  
               triangles++;  //add to amount of triangles
           }  
       }  
  
       System.out.println("Triangles: " + triangles);  //print
       System.out.println("Trials: " + trials);  //print
  
       double prob = (double)triangles / trials;  //probability checker
       System.out.println("Probability: " + prob);  
   }  
}  