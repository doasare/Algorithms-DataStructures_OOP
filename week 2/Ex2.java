import java.util.*;
public class Ex2
{
     // calculate sum of numbers
     public static void main(String[] args)
     {
          //input 
          Scanner input = new Scanner(System.in);
          System.out.println("Enter some numbers (all on one line, separated by spaces):");
          String line = input.nextLine();
          String[] numbers = line.split(" +");
          int[] a = new int[numbers.length];
          //convert to int
          for(int i=0; i<a.length; i++)
          {
              a[i]=Integer.parseInt(numbers[i]);
          }
          //find total
          System.out.println("The numbers are stored in an array");
          System.out.println("Total: "+addIn(a));
      
      }
     public static int addIn(int[] a)
     {
         int total=0;
         for(int i=0; i<a.length; i++)
         {
             total+=a[i];
             
         }
         return total;
     }
}

