public class Ex3Constructive
{
    //constructive times all numbers in array by 5
    public static void main(String[] args)
    {
        int[] numbers = {7,11,13,8,5,10};

        numbers=changeOne(numbers,5);
        
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }

    public static int [] changeOne(int[] y, int x)
    {
        int [] tmp=new int [y.length];        
        
        for(int i=0; i<y.length; i++)
        {
            tmp[i]=y[i]*x;
        }
        return tmp;
    }
}
