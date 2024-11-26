public class S0 extends CalcState
{
    public S0(CalcMachine machine, UserData userData, Controller controller){
        super(machine);
        
        boolean initialize = true;
        if (initialize)
        {
            Screen.commands(userData);
            initialize = false;
        }
        
        
        Screen.prompt(userData);
        
        machine.setCalcState(new S1(machine, userData, controller));
    }
}