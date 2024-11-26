public class S4 extends CalcState
{
    public S4(CalcMachine machine, UserData userData, Controller controller){
        super(machine);
        
        if( Screen.isExit() ) {
            System.exit(0);
        }
        else {
            machine.setCalcState(new S0(machine, userData, controller));
        }
    }
}