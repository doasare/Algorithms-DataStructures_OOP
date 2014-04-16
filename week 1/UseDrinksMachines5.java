import java.util.Scanner;
class UseDrinksMachines5
{
    //simulate purchasing a coke and fanta
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        DrinksMachine machine = new DrinksMachine(50,10,10);
        System.out.print("Enter the sum of money you wish to spend: ");
        int a= input.nextInt();
        machine.insert(a);
        System.out.println("I inserted " + a +"p into the machine");
        
        
        System.out.println("I press the button labelled \"Coke\"");
        Can myCan = machine.pressCoke();
        System.out.println("I press the button labelled \"Fanta\"");
        Can myCan2 = machine.pressFanta();
        System.out.println("I press the button labelled \"Change\"");
        int myChange = machine.pressChange();
        System.out.println("I have "+myCan+" and "+myCan2+" and "+myChange+"p");
        
        
        
    }
    
    
}
