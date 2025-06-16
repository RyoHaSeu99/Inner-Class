class Outer {
    private class HiddenInner {
        void secret() {
            System.out.println("private!");
        }
    }

    public void reveal() {
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
    }
}







/* 3
class Outer {

}

public class Main {
    String outerMessage = "Hello from Outer";

    class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Main.Inner inner = main.new Inner();

        inner.showMessage();
    }
}
*/








/* 2.
class Car {
    String brand;
    Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    class Engine {
        public void start() {
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    public void startEngine() {
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("빠른자동차");

        car.startEngine();
    }
}
*/




/* 1.
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
 */