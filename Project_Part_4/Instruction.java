
/**
 * Brayden Burgess
 */
public class Instruction //Brayden Burgess
{
    private OpCode opCode;
    private double value1;
    private double value2;

    public Instruction()
    {
        value1 = 1;
        value2 = 1;
        opCode = OpCode.NOP;
    }
    
    public Instruction(double val1, double val2, char op)
    {
        value1 = val1;
        value2 = val2;
        this.setOperation(op);
    }
    
    public double getValue1() { return value1; }
    public double getValue2() { return value2; }
    public OpCode getOperation() {return opCode; }
    
    public void setValue1(double newVal1) { value1 = newVal1; }
    public void setValue2(double newVal2) { value2 = newVal2; }

    public void setOperation(char newOp) {
        switch(newOp) {
            case 'A': opCode = OpCode.ADD; break;
            case 'S': opCode = OpCode.SUB; break;
            case 'M': opCode = OpCode.MUL; break;
            case 'D': opCode = OpCode.DIV; break;
            default:  opCode = OpCode.NOP; break;
        }
    }
}
