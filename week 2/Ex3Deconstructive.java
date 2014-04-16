public class Ex3Deconstructive 
{
    //desconstructive times all numbers in array by 5
    public static void main(String[] args)
    {
        int[] numbers = {7,11,13,8,5,10};
        int[] b = new int[numbers.length];
        b=changeOne(numbers,5);
        
        for(int i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
    }

    public static int [] changeOne(int[] y, int x)
    {
        for(int i=0; i<y.length; i++)
        {
            y[i]*=x;
        }
        return y;
    }
}
