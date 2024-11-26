public class initialState extends screenState
{
    public initialState(Machine machine, boolean functType, UserData userData, double answer){
        super(machine, functType, userData);
        
        if(functType) //is a prompt
        {
            machine.setState(new promptState(machine, functType, userData));
        }
        else//is a display
        {
            machine.setState(new displayState(machine, functType, userData, answer));
        }
    }
    
    
    
    }