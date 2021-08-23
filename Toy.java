package com.company;

public class Toy extends Thread {

    public static volatile boolean tumbler;

    @Override
    public void run() {
        while (!Thread.interrupted ()) {//бесконечный цикл
            try{
                if(tumbler){
                    System.out.println (Thread.currentThread ().getName () + ": Тумблер в положении ВЫКыЛы");
                    sleep (3000);
                    tumbler = false;
                }
            }catch (InterruptedException e){
                e.printStackTrace ();
            }
        }
    }
}
