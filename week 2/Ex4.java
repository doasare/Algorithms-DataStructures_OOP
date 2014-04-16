import static java.lang.Math.abs;
import java.util.*;

public class Ex4
{
    // check find closes possible number to target
    public static void main(String[] args)
    {
        int[] numbers = {19,9,30,47,5,10,20,36,21,11,13,51};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter target number: ");
        int target = input.nextInt();

        System.out.println(findNumber(numbers,target));

    }
    

    public static int findNumber(int[] y, int find)
    {
        int temp; 
        int bestFound=0;
        //default bestresult is set to first result
        int bestResult=y[0];
        
        //loop array
        for (int i=0; i<y.length;i++)
        {
            // if number is found return it
            if (find==y[i])
            {
                return bestResult;
            }
            else
            {
                // remove any negative values
                temp= Math.abs(find-y[i]);
                if (bestFound==0)
                {
                    bestFound=temp;
                    bestResult=y[i];
                }
                //check for lowest difference between find and array number
                else if (temp<bestFound)
                {
                    bestFound=temp;
                    bestResult=y[i];
                }
                
                
            }
        }
        return bestResult;
    }
}
