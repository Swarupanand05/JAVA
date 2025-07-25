
public class MyClass {

    // Static method
    static void displayMessage() {
        System.out.println("Hello from a static method!");
    }

    // Non-static method
    void instanceMethod() {
        System.out.println("Hello from a non-static method!");
    }

    public static void main(String[] args) {
        
        MyClass.displayMessage();

        
        MyClass obj = new MyClass();
        obj.instanceMethod();
    }
}
