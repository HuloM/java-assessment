package q2;

public class CLang implements Language, Runnable {
    @Override
    public void showMessage() {
        System.out.println("C Program is running");
    }

    @Override
    public void run() {
        // this will print the show message 10 times
        for (int i = 0; i < 10; i++){
            showMessage();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

