import java.util.Scanner;

class UseDrinksMachines4
{
     //simulate machine 2 is 10p cheaper that machine 1
     public static void main(String[] args)
     {
          // input
          Scanner input = new Scanner(System.in);
          System.out.print("Enter the price for drinks on your machine: ");
          int p = input.nextInt();
          
          //create machine 1
          DrinksMachine machine1 = new DrinksMachine(p);
          //create 10p cheaper machine
          DrinksMachine machine2 = cheaperBy10p(machine1);
          
          System.out.println("The machice price you entered is "+p+"p");
          System.out.println("Machine 1 charges "+machine1.getPrice()+"p");
          System.out.println("Machine 2 charges "+machine2.getPrice()+"p");
     }

     public static DrinksMachine cheaperBy10p(DrinksMachine mach1)
     {
          return new DrinksMachine(mach1.getPrice()-10);
     }

}
