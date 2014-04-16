import java.util.Scanner;

class UseDrinksMachines3
{
     //simulate finding which machine is cheaper for customer 
     public static void main(String[] args)
     {
          //input scan
          Scanner input = new Scanner(System.in);
          
          //set price and create machine one
          System.out.print("Enter the price for drinks on machine 1: ");
          DrinksMachine mach1 = new DrinksMachine(input.nextInt(),10,10);
          
          //set price and create machine two
          System.out.print("Enter the price for drinks on machine 2: ");
          DrinksMachine mach2 = new DrinksMachine(input.nextInt(),10,10);
          
          // insert 100p into both machines
          mach1.insert(100);
          mach2.insert(100);
          
          // finds which machine is cheaper out of the two and return instance
          DrinksMachine mach3 = cheaper(mach1,mach2);
          
          // charge for cheaper machine
          Can myCan = mach3.pressCoke();
          int myChange = mach1.pressChange()+mach2.pressChange();
          System.out.println("After buying a can from the cheaper machine ");
          System.out.println("I am left with "+myChange+"p from two pounds");
     }
    
     public static DrinksMachine cheaper(DrinksMachine m1,DrinksMachine m2)
     {
          if(m1.getPrice()<m2.getPrice())
             return m1;
          else
             return m2;
     }

}
