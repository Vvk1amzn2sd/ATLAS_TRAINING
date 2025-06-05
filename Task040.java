// Abstract class
abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class ACRemote extends Gadgets {
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

class FanRemote extends Gadgets {
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class CoolerRemote extends Gadgets {
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

// Main class
public class Task040 {
    public static void main(String[] args) {
        Gadgets remote1 = new TVRemote();
        remote1.turnOn();
        remote1.turnOff();

        Gadgets remote2 = new ACRemote();
        remote2.turnOn();
        remote2.turnOff();

        Gadgets remote3 = new FanRemote();
        remote3.turnOn();
        remote3.turnOff();

        Gadgets remote4 = new CoolerRemote();
        remote4.turnOn();
        remote4.turnOff();
    }
}
