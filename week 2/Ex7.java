import java.util.*;

public class Ex7
{
   // remove any duplicates in second array and merge
   public static void main(String [] args)
   {
        
       int[] Array = {1,2,3,4,0,6,8,9,10,1};
       int[] Array2 = {0,3, 8,29,30,31};
       int[] answer =  JoinArray(Array, Array2);
       
       System.out.println(Arrays.toString(answer));
        
    }
    
    public static int[] JoinArray(int[] array1, int[] array2)
    {
         int[] Both = new int[array1.length+array2.length];
         
         int count= 0;
         
         for(int i = 0; i < array1.length; i++)// add array one
         {
            Both[i] = array1[i];
            count++;
         }
         int count1 =0;
         for(int i= 0; i< array2.length; i++){ //for each loop changing doubles to zero
             for(int j : array1){
                 if(array2[i] == j){
                     array2[i] = 0;
                 }
             }
         }
         
         for(int i= 0; i< array2.length; i++){ // when not = 0 add count
             if(array2[i] != 0){
                count1++;
                }
         }
         
         int[] tmp = new int[count + count1]; // new array of new length
         
         for(int i=0; i< array2.length; i++){
             Both[count++] = array2[i];
         }
            
         count = 0;
         
         for(int i=0; i<Both.length; i++){ // when not = 0 add to new array tmp
            if(Both[i] !=0){
                tmp[count] = Both[i];
                count++;
            }
         }
         
         
         
         return tmp; // return new array
    }
}