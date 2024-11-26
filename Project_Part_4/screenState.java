public abstract class screenState
{
    protected  Machine machine;
    protected boolean functType;
    protected UserData userData;
    // current state
    public screenState(Machine machine, boolean functType, UserData userData){
        this.machine=machine;
        this.functType=functType;
        this.userData=userData;
    }
    
}