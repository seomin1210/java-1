interface PhoneInterface {
    final int TIMEOUT = 10000; // public static final 생략 가능
    public void sendCall();
    public void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

class Calc {
    public int calculator(int x, int y) {
        return x + y;
    }
    
}

class SmartPhone extends Calc implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("Sending a call...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    public void schedule() {
        System.out.println("Scheduling...");
    }

    public void playGame() {
        System.out.println("Playing a game...");
    }
}


public class Ex56InterfaceEx {
    
}
