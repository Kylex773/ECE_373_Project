public class displayState extends screenState //do display
{
    public displayState(Machine machine, int functType, UserData userData, double answer){
        super(machine, functType, userData);
        
        char op = userData.getOpChar();
        double val1 = userData.getVal1();
        double val2 = userData.getVal2();
        
        
        switch(op)
        {
            case 'A':
            System.out.println("Sum: " + String.format("%.4f", answer)
                + "\n");
                break;
                
            case 'S':
            System.out.println("Difference: " + String.format("%.4f", answer)
                + "\n");
                break;
                
            case 'M':
                System.out.println("Product: " + String.format("%.4f", answer)
                + "\n");
                break;
                
            case 'D':
                System.out.println("Quotient: " + String.format("%.4f", answer)
                + "\n");
                break;
            
        }
    
        machine.terminateState();
    }
    }