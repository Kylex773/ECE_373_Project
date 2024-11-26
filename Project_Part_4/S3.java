public class S3 extends CalcState
{
    public S3(CalcMachine machine, UserData userData, Controller controller, double answer){
        super(machine);
        
        Screen.displayAnswer(answer, userData);
        
        machine.setCalcState(new S4(machine, userData, controller));
    }
}