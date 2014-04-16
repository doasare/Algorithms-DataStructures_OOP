
public class Ex6
{
   public static void main(String [] args)
   {
       int[] Array = {1,2,3,4,6,8};
       int target = 2;
       
       int[] Farray = FindSmallest(Array, target);
      
       System.out.print("The new array is: ");
       for(int i = 0; i< Farray.length; i++)
           {
              
               System.out.print(Farray[i] + " ");
            }
        System.out.println(" ");
       
       
      
   }
    
   public static int[] FindSmallest(int[] array, int myNumber)
   {
      
        boolean swapped = true;
        int j = 0;
        int tmp;
        int count = 0;
         
        while (swapped) //bubble sort in order
         {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) 
             {
                if (array[i] > array[i + 1]) 
                    {
                        tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                        swapped = true;
                    }
             }
         
        
         }
      
      
           for(int h=0; h<array.length; h++)
            {
               if(array[h]<myNumber)   
                {
                    count++;
                }    
            }
         int size = array.length - count;
         
      
         int[] Narray = new int[size];
   
           for(int k =0; k<Narray.length; k++)
            {
                Narray[k] = array[k+count];
            }
            
          return Narray;
     
   }

}
 