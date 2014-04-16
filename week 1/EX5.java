public class EX5
{
    //Two cans anc check if they are full if they are drink from both
    public static void main(String[] args)
    {
        DrinksMachine machine = new DrinksMachine(50,10,10);
        System.out.println("I insert 200p into the drinks machine");
        machine.insert(200);
        System.out.println("I press the button labelled \"Coke\"");
        Can myCan1 = machine.pressCoke();
        myCan1.drink();
        System.out.println("I press the button labelled \"Coke\"");
        Can myCan2 = machine.pressCoke();
        TwoCans(myCan1, myCan2);
      
    }

    //drink from first can then second.
    public static void TwoCans (Can can1 ,Can can2)
    {
        boolean fullness1 = can1.isFull();
        boolean fullness2 = can2.isFull();
        if(fullness1 == true)
        {
            System.out.println("You are drinking from the first can");
            can1.drink();
        }
        else if(fullness1 == !true && fullness2 == true)
        {
            System.out.println("You are drinking from the second can");
            can2.drink();
        }
        else
        {
            System.out.println("Both cans are empty");
        }

    }
}
