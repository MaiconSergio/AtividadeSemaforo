package Exec02;

import java.util.concurrent.Semaphore;

public class MainSemaf2 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        for (int i = 0; i < 5; i++) {
            Thread t = new Exersemaf2(i, semaphore);
            t.start();
        }
    }
}