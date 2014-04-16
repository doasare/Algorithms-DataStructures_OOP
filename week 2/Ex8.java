import java.util.Arrays;
import java.util.ArrayList;
public class Ex8
{
   //check numbers are in order
   public static void main (String[]args)
   {
       
       int [] array={4,11,13};
       boolean loopcontrol=true;
       
       for(int i=1;i<array.length;i++)// check ascending
       {
           if (array[i-1]>array[i])
           {
               loopcontrol =false;
               break;
            }
           
        }
       for(int i=1;i<array.length;i++)// check descending
       {
           if (array[i-1]<array[i])
           {
               loopcontrol =false;
               break;
            }
           
        }
        
        System.out.println("Array is in numeric order: "+ loopcontrol);
       
    }
    
}