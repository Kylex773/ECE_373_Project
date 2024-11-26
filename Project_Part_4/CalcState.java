public abstract class CalcState
{
    protected CalcMachine machine;
    
    // current state
    public CalcState(CalcMachine machine){
        this.machine=machine;
    }
}