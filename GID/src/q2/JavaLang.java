package q2;

public class JavaLang implements Language, Runnable {
    @Override
    public void showMessage() {
        System.out.println("Java Program is running");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            showMessage();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
