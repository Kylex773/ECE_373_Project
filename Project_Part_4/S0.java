public class S0 extends CalcState
{
    public S0(CalcMachine machine, UserData userData, Controller controller){
        super(machine);
        
        Screen.prompt(userData);
        
        machine.setCalcState(new S1(machine, userData, controller));
    }
}