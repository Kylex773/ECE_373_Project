public class initialState extends screenState
{
    public initialState(Machine machine, int functType, UserData userData, double answer){
        super(machine, functType, userData);
        
        if(functType == 1) //is a prompt
        {
            machine.setState(new promptState(machine, functType, userData));
        }
        else if(functType == 0)//is a display
        {
            machine.setState(new displayState(machine, functType, userData, answer));
        }
        else//is a display
        {
            machine.setState(new commandState(machine, functType, userData));
        }
    }
    
    
    
    }