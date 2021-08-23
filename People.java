package com.company;

public class People extends Thread {

    @Override
    public void run() {
        int count = 0;
        while (!Thread.interrupted ()) {
            if (!Toy.tumbler) {
                if (count < 3) {
                    try {
                        System.out.println (Thread.currentThread ().getName () + ": Тумблер в положении ВКЛ");
                        Toy.tumbler = true;
                        sleep (1000);
                    } catch (InterruptedException er) {
                        er.printStackTrace ();
                    }
                } else {
                    break;
                }
                count++;
            }
        }
    }
}
