import java.util.Scanner;
public class Ex8
{
    // simulate customers buying cans from a single machines during the day
    public static void main(String[] args)
    {
      
      DrinksMachine machineOne = new DrinksMachine(50,0,10); //Creates Machine 1
      Scanner input = new Scanner(System.in); 
      boolean endDay=false; // while loop controller
      int coke=0; //Count how many Coke Cans Brought
      int fanta=0; //Count how many Fanta Cans Brought
      int change;
      String ans;
      String ans2;
      
          while(!endDay)
          {
              // enter amount of money in integer catches expection and closes mahcine
             try
             {
              System.out.println("Enter the sum of money you wish to spend: ");
              int amount = input.nextInt();
              machineOne.insert(amount);
             }
             catch(Exception e)
             {
                 System.out.println("\nYou did not enter Integer values");
                 System.out.print("------------------------\n");
                 System.out.print("Today's collection from machine: " + machineOne.collectCash()+"\n");
                 System.out.print("Coke Cans sold: " + coke+"\n");
                 System.out.print("Fanta Cans sold: " + fanta+"\n");
                 System.exit(0);
                       
             }

              // askes either for coke or fanta button
              
              System.out.println("\nWhat Drink would you like to buy? // type coke or fanta");
              System.out.println("// Type anything else to end the day");
              ans= input.next();
              
              // processes order 
              if (ans.equals("coke"))
              {
                  if (machineOne.cokesEmpty())
                  {
                      System.out.println("\nCoke is Empty try fanta!");
                      change = machineOne.pressChange();
                      System.out.println("You have "+change+"p change");
                  }
                  else
                  {
                      machineOne.pressCoke();
                      System.out.println("\nYou brought a Can of coke!");
                      change = machineOne.pressChange();
                      System.out.println("You have "+change+"p change");
                      coke++;
                  }
              }
              else if (ans.equals("fanta"))
              {
                   if (machineOne.fantasEmpty())
                  {
                      System.out.println("\nFanta is Empty try Coke!");
                      change = machineOne.pressChange();
                      System.out.println("You have "+change+"p change");
                  }
                  else
                  {
                      machineOne.pressFanta();
                      System.out.println("\nYou brought a Can of Fanta!");
                      change = machineOne.pressChange();
                      System.out.println("You have "+change+"p change");
                      fanta++;
                  }
              }
              else
              {
                System.exit(0); 
 
              }
              
              // askes who else wants to order from machine
              System.out.println("\nWould anyone else like to buy a can?");
              ans2= input.next();
              // if yes the controller will stay false and continue the loop, else it will change to true to represent the end of the day.
              if (ans2.equals("yes"))
              {
                  endDay=false;  
              }
              else if (ans2.equals("no"))
              {
                endDay=true;  
              }
              else
              {
                  endDay=true;  
              }
              System.out.print("------------------------ New Customer\n");
 
          }
          
      // print system information at the end of the day. /money collected/coke cans sold/ fanta cans sold
      System.out.print("------------------------\n");
      System.out.print("Today's collection from machine: " + machineOne.collectCash()+"\n");
      System.out.print("Coke Cans sold: " + coke+"\n");
      System.out.print("Fanta Cans sold: " + fanta+"\n");
    }

}
