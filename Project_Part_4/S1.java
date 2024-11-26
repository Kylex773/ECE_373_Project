public class S1 extends CalcState
{
    public S1(CalcMachine machine, UserData userData, Controller controller){
        super(machine);
        
        controller.setValues(userData.getVal1(), userData.getVal2(), userData.getIsPtr1(), userData.getIsPtr2());
        
        machine.setCalcState(new S2(machine, userData, controller));
    }
}