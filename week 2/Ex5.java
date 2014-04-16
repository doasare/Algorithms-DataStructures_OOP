import java.util.Arrays;
public class Ex5
{
    //add two arrays together whiles maintaining order
    public static void main (String[]args)
    {
        
        int [] array1={7,11,13,8,5,10};
        int [] array2={8,27,30,11,5};
        System.out.println("this is array1:"+Arrays.toString(array1));
        System.out.println("this is array2:"+Arrays.toString(array2));
        int [] newArray= addArray(array1,array2);

        System.out.println("this is array1 and array2 together:"+Arrays.toString(newArray));
    }
    public static int[] addArray (int[] a1, int [] a2)
    {
        int[] tempArray = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, tempArray, 0, a1.length);
        System.arraycopy(a2, 0, tempArray, a1.length, a2.length);
        
        return tempArray;

    }
  
}
