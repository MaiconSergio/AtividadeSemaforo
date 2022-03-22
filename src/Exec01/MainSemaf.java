package Exec01;

import java.util.concurrent.Semaphore;

public class MainSemaf {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        for (int i = 0; i < 21; i++) {
            Thread t = new ExerSemaf1(i, semaphore);
            t.start();
        }
    }
}