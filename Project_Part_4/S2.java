public class S2 extends CalcState
{
    public S2(CalcMachine machine, UserData userData, Controller controller){
        super(machine);
        
        double answer = controller.doOperation(userData.getOpChar());
        
        machine.setCalcState(new S3(machine, userData, controller, answer));
    }
}