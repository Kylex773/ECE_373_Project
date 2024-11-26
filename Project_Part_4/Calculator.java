
/**
 * Brayden Burgess
 */

public class Calculator
{
    public static void main() {
        Controller controller = new Controller();
        double answer;
        boolean exitTime = false;
        UserData userData = new UserData();
        
        CalcMachine calcStateMachine = new CalcMachine();
        
        String welcome = ("Welcome to the Calculator\nEnter a command (? for list): ");
        
        Screen.print(welcome);
        
        
        
        
        while(true) {
            try {
                calcStateMachine.setCalcState(new S0(calcStateMachine, userData, controller));
                
                //Below obsolete (done by above state machine):
                
                //main calculator code
                //Screen.prompt(userData);
                
                //to calculate:
                //controller.setValues(userData.getVal1(), userData.getVal2(), userData.getIsPtr1(), userData.getIsPtr2());
                //answer = controller.doOperation(userData.getOpChar());
                //end calculation
                
                //Screen.displayAnswer(answer, userData);
                
                //ask if the user would like to quit
                //exitTime = Screen.isExit();
            }
            catch(Exception e) {
                Screen.print(e.getMessage()); //RuntimeException thrown for invalid operation
            }
        }
    }
}