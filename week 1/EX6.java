public class EX6
{
   // simulate checking for cheaper machine 
   public static void main(String[] args)
   {
      DrinksMachine machineOne = new DrinksMachine(40,10,10);
      DrinksMachine machineTwo = new DrinksMachine(20,10,10);
      TwoMachines(machineOne,machineTwo);
      System.out.println(machineOne.getPrice());
      System.out.println(machineTwo.getPrice());
   }
    
   public static void TwoMachines (DrinksMachine m1 ,DrinksMachine m2)
   {         
      if(m1.getPrice()<m2.getPrice())
      {
          int y = m2.getPrice();
                   
          m1.setPrice(y);
          System.out.println("Machine1 was cheaper but, was updated to the same price as machine2");
      }
         
      else if(m1.getPrice()>m2.getPrice())
      {
          int y = m1.getPrice();
             
          m2.setPrice(y);
          System.out.println("Machine2 was cheaper but, was updated to the same price as machine1");
      }
      else 
      {
          System.out.println("They are the same price");
      }
   }

    
    
}