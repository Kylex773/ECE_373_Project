/**
 Kyle
 */
public class Register
{ 
    private double memVal; //value stored in the register
    
    public Register(double memVal) {this.memVal = memVal;} //constructor that instantiates a value
    
    public Register(){this.memVal = 0.0;} //default constructor
    
    public void setVal(double newVal) {this.memVal = newVal;}//setter to change register's value

    public double getVal(){return memVal;} //getter to return register's value
    
}
