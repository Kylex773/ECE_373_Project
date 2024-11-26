
/**
 * Data Type Class
 * Kyle and Brayden
 */
public class UserData
{
    private double val1, val2;
    private boolean isPtr1, isPtr2;
    private char opChar;

    public UserData()
    {
        val1 = 0.0;
        val2 = 0.0;
        isPtr1 = false;
        isPtr2 = false;
        opChar = 'N';
    }
    
    public void setValues(double value1, double value2, boolean isPtr1, boolean isPtr2, char opChar) {
        val1 = value1;
        val2 = value2;
        this.isPtr1 = isPtr1;
        this.isPtr2 = isPtr2;
        this.opChar = opChar;
    }
    
    public double getVal1() { return val1; }
    public double getVal2() { return val2; }
    public boolean getIsPtr1() { return isPtr1; }
    public boolean getIsPtr2() { return isPtr2; }
    public char getOpChar() { return opChar; }
}
