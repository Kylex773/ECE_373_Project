public class CalcMachine
{
    public CalcState state;
    
    public CalcMachine() {
        state=null;
    }
    
    public void setCalcState(CalcState state){
        this.state=state;
    }
}