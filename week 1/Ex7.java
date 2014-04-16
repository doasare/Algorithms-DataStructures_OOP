public class Ex7
{
    //simulate count how many coke in machine
    public static void main(String[] args)
    {     
        DrinksMachine machine = new DrinksMachine(50,10,10);        
        System.out.println("There are  " +NumberOfCokes(machine)+ "  cokes");
            
    }
    
    public static int NumberOfCokes(DrinksMachine m1)
    {
        boolean checkMachine = m1.cokesEmpty();
        System.out.println(checkMachine);
        int count =0;
        m1.insert(10000);
            
        while (checkMachine == false)
        {
            count++;
            m1.pressCoke();
            checkMachine = m1.cokesEmpty();
        }
              
        for(int i = 0; i<=count; i++)
        {
            Can myCan = m1.pressCoke();
            m1.loadCoke(myCan); 
        }
        return count;    
    }   
}