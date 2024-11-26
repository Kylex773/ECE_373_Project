import java.util.Scanner;

public class promptState extends screenState //do prompt state
{
    public promptState(Machine machine, boolean functType, UserData userData){
        super(machine, functType, userData);
    
    
        char opChar;

        double val1;
        double val2;
        
        int boolTemp;
        boolean isPtr1;
        boolean isPtr2;
        
        //function picker
        System.out.println("Choose a function (A,S,M,D): "); 
        Scanner keyboard = new Scanner(System.in);
        opChar = keyboard.next().charAt(0);
        
        //is value 1 from memory?
        System.out.println("Is the first value from memory? (true for yes, false for no)"); 
        isPtr1 = keyboard.nextBoolean();
        
        //is value 2 from memory?
        System.out.println("Is the second value from memory? (true for yes, false for no)\n"); 
        isPtr2 = keyboard.nextBoolean();
        
        
        //get first value
        System.out.println("Choose the first value: "); 
        val1 = keyboard.nextDouble();
        
        //get second value
        System.out.println("Choose the second value: "); //get second value
        val2 = keyboard.nextDouble();
        
        machine.setState(new valuesState(machine, functType, userData, val1, val2, isPtr1, isPtr2, opChar));
        }
    }