public class valuesState extends screenState
{
    public valuesState(Machine machine, int functType, UserData userData, double val1, double val2,
    boolean isPtr1, boolean isPtr2, char opChar){
        super(machine, functType, userData);
    
        
        userData.setValues(val1, val2, isPtr1, isPtr2, opChar);
        
        machine.terminateState();
    }
    
    
    
    }