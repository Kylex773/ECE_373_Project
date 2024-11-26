public abstract class screenState
{
    protected  Machine machine;
    protected int functType;
    protected UserData userData;
    // current state
    public screenState(Machine machine, int functType, UserData userData){
        this.machine=machine;
        this.functType=functType;
        this.userData=userData;
    }
    
}