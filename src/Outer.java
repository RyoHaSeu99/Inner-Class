public class Outer {
    private String message = "Hello from the outer class.";

    class InnerClass {
        void displayMessage() {
            System.out.println("Inner says: " + message);
        }
    }

    public void callInner() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.callInner();

    }
}