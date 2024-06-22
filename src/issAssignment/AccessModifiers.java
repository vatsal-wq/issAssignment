package issAssignment;

public class AccessModifiers {
    // Private variable: accessible only within this class
    private String privateVar = "Private Variable";
    
    // Default (package-private) variable: accessible within the same package
    String defaultVar = "Default Variable";
    
    // Protected variable: accessible within the same package and subclasses
    protected String protectedVar = "Protected Variable";
    
    // Public variable: accessible from anywhere
    public String publicVar = "Public Variable";
    
    // Getter for private variable
    public String getPrivateVar() {
        return privateVar;
    }
}
