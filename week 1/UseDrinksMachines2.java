import java.util.Scanner;
//Use Amount to purchase as many cans and possibe and return change
class UseDrinksMachines2
{
     public static void main(String[] args)
     {
          // get input
          Scanner input = new Scanner(System.in);
          //create DrinksMachine Object
          DrinksMachine machine = new DrinksMachine(50,2,10);
          
          System.out.print("Enter the sum of money you wish to spend on cokes: ");
          int amount = input.nextInt();
          
          // call method to spend money on coke can available
          int cans = spendOnCokes(amount,machine);
          
          // find changes in machine
          int change = machine.pressChange();
          
          System.out.println("You have bought "+cans+" cans of coke");
          System.out.println("You have "+change+"p left");
          
          // did you empty the machine or not?
          if(machine.cokesEmpty())
             System.out.println("You have emptied the machine of cokes");
          else
             System.out.println("The machine still has some cokes left");
     }

     public static int spendOnCokes(int sum,DrinksMachine mach)
     {
          int count=0;
          mach.insert(sum);
          while(!mach.cokesEmpty()&&mach.getBalance()>=mach.getPrice())
             {
              mach.pressCoke();
              count++;
             }
          return count;
     }
}
