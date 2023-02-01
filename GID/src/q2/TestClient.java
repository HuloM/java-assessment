package q2;

import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Language Clanguage = new CLang();
        Language Javalanguage = new JavaLang();

        Thread jThread = new Thread((Runnable) Javalanguage);
        Thread cThread = new Thread((Runnable) Clanguage);

        System.out.println("What is your preferred language? (Java or C)");
        String language = scanner.nextLine();

        if (language.equalsIgnoreCase("Java")) {
            RunPriorityThread("Java was selected", jThread, cThread);
        } else if (language.equalsIgnoreCase("C")) {
            RunPriorityThread("C was selected", cThread, jThread);
        } else {
            System.out.println("Invalid language");
        }
    }

    private static void RunPriorityThread(String languageSelected, Thread priority, Thread lessPriority) {
        System.out.println(languageSelected);
        priority.setPriority(Thread.MAX_PRIORITY);
        lessPriority.setPriority(Thread.MIN_PRIORITY);

        priority.start();
        lessPriority.start();
    }
}
