import java.util.Vector;
import java.util.List;

/**
 * Brayden Burgess
 */
public class ALU
{
    private List<PathItem> operators = new Vector<PathItem>();
    private Instruction instr;
    
    public ALU()
    {
        instr = new Instruction();
        operators.add(new Adder());
        operators.add(new Subtractor());
        operators.add(new Multiplier());
        operators.add(new Divider());
    }
    
    public void setInstr(Instruction newInstr) { instr = newInstr; }
    
    public double getResult(Instruction instr) {
        int index;
        double result;
        switch(instr.getOperation()) {
            case OpCode.ADD:
                index = 0;
                break;
            case OpCode.SUB:
                index = 1;
                break;
            case OpCode.MUL:
                index = 2;
                break;
            case OpCode.DIV:
                index = 3;
                break;
            default: throw new RuntimeException("Invalid Operation - Please try again!");
        }
        
        operators.get(index).setVals(instr.getValue1(), instr.getValue2());
        return operators.get(index).getOutput();
    }
}
