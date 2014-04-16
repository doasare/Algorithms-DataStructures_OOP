public class EX4

{
    // simulate drinking a can and checking if it has be drunk
       public static void main(String[] args)
     {
          boolean fullness;
          DrinksMachine machine = new DrinksMachine(50,10,10);
          System.out.println("I insert 200p into the drinks machine");
          machine.insert(200);
          System.out.println("I press the button labelled \"Coke\"");
          Can myCan = machine.pressCoke();
          System.out.println("My can is full");
          System.out.println("I am drinking the can");
          myCan.drink();
          fullness = myCan.isFull();
          if(fullness == !true)
                {
                  System.out.println("The can is now empty");
                         
                }
           else{
            System.out.println("The can is still full");
            }
          
            
      }
   
}