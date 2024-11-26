import java.util.*;


/**
Kyle
 */
public class Screen
{
    public static void print(String string)
    {
        System.out.println(string + "\n");
    }
     
    public static void displayAnswer(double answer, UserData userData)
    {
        Machine machine=new Machine();        
        machine.setState(new initialState(machine, false, userData, answer));                                                                                        
    }
    
    public static void prompt(UserData userData)
    {
        Machine machine=new Machine();
        machine.setState(new initialState(machine, true, userData, 0));
        
    }
    public static boolean isExit()
    {
        System.out.println("Are you finished? (true or false)\n");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextBoolean();
    }
}
