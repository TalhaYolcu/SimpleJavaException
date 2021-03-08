import simpleexception.Exception;
public class Main {
    public static double divide(double x,double y) throws Exception{
        if(y==0) {
            throw new Exception("DividebyZeroException");
        }
        else {return x/y;}
    }
    public static void main(String[] args) {
        try {
            double x=5;
            double y=0;
            double z=divide(x,y);
        }
        catch(Exception ne) {
            System.out.println(ne);
        }
    }    
}
