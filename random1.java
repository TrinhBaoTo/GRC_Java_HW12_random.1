// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment Random Number #1,

// This program's behavior is to do a "random walk",
//    you begin at position 0. Then, on each step, 
//    you should either increase or decrease the position
//    by 1 (with equal probability).
//    The walk stops when x or -x is reached.

import java.util.Scanner;
import java.util.*;


public class random1
{//open class
   public static void main(String[] args)
   {//open main
    
      int steps=randomWalk(30);
      //call function for x=30
      
      System.out.println("");
      System.out.print("Steps : "+steps);
      //print steps
    
   }//end main
   
   public static int randomWalk(int x)
   { //open method
      int position=0;
      System.out.println("position = "+position);
      //declare position and print out position 0
      
      Random inde = new Random();
      
      int id = inde.nextInt(3)-1;
      //random from -1 to 1
      
      int steps=0;
      //declare steps
      
      while ((position<x) && (position>-x)){
      //while loop till it reach x or -x
         while (id==0){
         // does not increase or decrease 0
            id = inde.nextInt(3)-1;
         }
         
         position=position+id;
         //update position
         System.out.println("position = "+position);
         
         id = inde.nextInt(3)-1;
         //update new id (+1 or -1) 
         steps=steps+1;
         //count steps
      }   
      
      return steps;         
   }//end method
   
}//end class