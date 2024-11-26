/**
 Kyle
 */
public class PathItem
{
    double val1;
    double val2;
    
    
    protected PathItem(double val1, double val2)
    {
        this.val1 = val1;
        this.val2 = val2;
    }
    
    protected PathItem()
    {
        this.val1 = 0.0;
        this.val2 = 0.0;
    }
    
    public void setVals(double val1, double val2)
    {
        this.val1 = val1;
        this.val2 = val2;
    }
    
    
    protected double getOutput(){return 0.0;} //parent operation
}
