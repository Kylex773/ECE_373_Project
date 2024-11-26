import java.util.*;


public class Machine
{
    public screenState state;
    
    
    public Machine() {
        state=null;
    }
    
    public void setState(screenState state){
        this.state=state;
        
    }
    public void terminateState(){
        state=null;
    }
}