package simpleexception;
public class Exception extends Throwable {
	private String message;
    public Exception(String message) {
        this.message=message;
    }
    public String toString() {
        return new String("Exception occured: "+this.message);
    }
}