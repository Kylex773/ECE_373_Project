import java.util.List;
import java.util.Vector;

/**
 * Brayden Burgess
 */
public class Controller
{
    private double value1, value2;
    private boolean isVal1MemLoc, isVal2MemLoc;
    private char operation; //ASMD
    private ALU alu = new ALU();
    private Instruction instr;
    private List<Register> regFile = new Vector<Register>();
    
    public Controller()
    {
        isVal1MemLoc = false;
        isVal2MemLoc = false;
        operation = 'N';
        instr = new Instruction(0.0, 0.0, operation);
    }
    
    public double doOperation(char op) {
        operation = op;
        instr = new Instruction(value1, value2, operation);
        
        double ans = alu.getResult(instr); //call alu's function
        
        Register tempReg = new Register(ans);
        //tempReg.setVal(ans);
        regFile.add(tempReg);
        return ans;
    }
    
    public void setValues(double v1, double v2, boolean isPtr1, boolean isPtr2) {
        isVal1MemLoc = isPtr1;
        isVal2MemLoc = isPtr2;
        
        int index1 = (int)v1;
        int index2 = (int)v2;
        
        value1 = (isVal1MemLoc) ? regFile.get(index1).getVal() : v1;
        value2 = (isVal2MemLoc) ? regFile.get(index2).getVal() : v2;
    }
    
}
