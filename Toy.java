package com.company;

public class Toy {
    private final int SLEEP_TIME = 3000;
    private final int countSteps = 3;
    private volatile boolean switcher = false;

    public void switchON () {
        for (int i = 0; i < countSteps; i++) {
            if (!switcher) {
                switcher = true;
                System.out.println (Thread.currentThread ().getName () + " -> * ВКЛ *");
            }
            try {
                Thread.sleep (SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }

    public void switchOFF () {
        while (!Thread.currentThread ().isInterrupted ()) {
            if (switcher) {
                switcher = false;
                System.out.println (Thread.currentThread ().getName () + " -> Выключить");
            }
        }
    }
}
