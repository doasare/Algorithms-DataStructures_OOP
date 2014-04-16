//Purchasing a drink from DrinksMachine
class UseDrinksMachines1
{
     public static void main(String[] args)
     {
      //create an instance on drink machine with (cost,amount of coke, amount of fanta)
      DrinksMachine machine = new DrinksMachine(50,10,10);
      
      //how much i would like to inset into the machines
      int insertAmount = 200;
      System.out.println("I insert "+insertAmount+"p into the drinks machine");
      machine.insert(insertAmount);
      
      // select the can i would like to purchase
      Can myCan = machine.pressCoke();
      System.out.println("I press the button labelled \"Coke\"");
      
      
      // receieve changes back from machine
      System.out.println("I press the button labelled \"change\"");
      int myChange = machine.pressChange();
      System.out.println("I have "+myCan+" and "+myChange+"p");
     }
}
