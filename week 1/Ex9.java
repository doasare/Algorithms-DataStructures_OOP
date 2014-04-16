import java.util.Scanner;
public class Ex9
{
    //simulate using the cheaper machine until it run out and then use the more expensive machine
    public static void main(String[] args)
    {
      
      DrinksMachine machineOne = new DrinksMachine(30,0,2); //Creates Machine1
      DrinksMachine machineTwo = new DrinksMachine(50,1,0);//Creates Machine2
      DrinksMachine machineCheap;
      DrinksMachine machineNotCheap;
      Boolean emptyMachine=false; //Controller for While Loops
      String ans;
      Scanner input = new Scanner(System.in);
      machineOne.insert(13000);// enter money into machine 1
      machineTwo.insert(13000);//enter money into machine 2 
      
      //checks which machine is cheaper
      if (machineOne.getPrice()<machineTwo.getPrice())
      {
          machineCheap=machineOne;
          machineNotCheap=machineTwo;
      }
      else
      {
          machineCheap=machineTwo;
          machineNotCheap=machineOne;
      }
      //Process Can Orders on machine 1 (Cheaper Machine)
      while (!emptyMachine)
      {
          if (machineCheap.cokesEmpty()&&machineCheap.fantasEmpty())
          {
              
              
              emptyMachine=true;
              System.out.println("\nMachine empty you will now use the more expensive Machine");
              System.out.println("\n--------------------------");
              
          }
          else 
          {
              System.out.println("What Drink would you like to buy from machine1? // type coke or fanta");
              ans= input.next();
              
                  if (ans.equals("coke"))
                  {
                      if (machineCheap.cokesEmpty())
                      {
                        System.out.println("Coke is Empty try fanta!");
                      }
                      else
                      {
                         machineCheap.pressCoke();
                         System.out.println("You brought a Can of Coke!");
                      }  
                  }
                  else if (ans.equals("fanta"))
                  {
                      if (machineCheap.fantasEmpty())
                      {
                          System.out.println("fanta is Empty try coke!");
                      }
                      else
                      {
                         machineCheap.pressFanta();
                         System.out.println("You brought a Can of Fanta!");
                      }  
                  }
                  else
                  {
                     System.exit(0);               
                  } 
              
            }
        }
       emptyMachine=false; //reset While Controller
       
       //Process Can Orders on Machine 2 (More Expensive Machine)
      while (!emptyMachine)
      {
            if (machineNotCheap.cokesEmpty()&&machineNotCheap.fantasEmpty())
            {
              emptyMachine=true;
              System.out.println("---------\nMachine 2 is empty");
              
            }
            else 
            {
              System.out.println("What Drink would you like to buy from machine2? // type coke or fanta");
              ans= input.next();
              
                  if (ans.equals("coke"))
                  {
                      if (machineNotCheap.cokesEmpty())
                      {
                        System.out.println("Coke is Empty try fanta!");
                      }
                      else
                      {
                         machineNotCheap.pressCoke();
                         System.out.println("You brought a Can of Coke!");
                      }  
                  }
                  else if (ans.equals("fanta"))
                  {
                      if (machineNotCheap.fantasEmpty())
                      {
                          System.out.println("fanta is Empty try coke!");
                      }
                      else
                      {
                         machineNotCheap.pressFanta();
                         System.out.println("You brought a Can of Fanta!");
                      }  
                  }
                  else
                  {
                     System.exit(0);               
                  } 
              
            }
      
      }
      System.out.println("\nBoth Machines are empty");
    
    
    }
}
