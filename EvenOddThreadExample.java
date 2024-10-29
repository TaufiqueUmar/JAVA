class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000); // Sleep for a short duration to simulate work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000); // Sleep for a short duration to simulate work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class EvenOddThreadExample {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start(); // Start even thread
        oddThread.start(); // Start odd thread
    }
}
