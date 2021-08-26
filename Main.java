package com.company;

public class Main {

    public static void main ( String[] args ) throws InterruptedException {

        Toy toy = new Toy ();

        Thread user = new Thread (null, toy::switchON, "Пользователь");
        Thread Toy = new Thread (null, toy::switchOFF, "Игрушка");

        user.start ();
        Toy.start ();

        user.join ();
        Toy.interrupt ();

        System.out.println ("\nПотоки завершены");
    }
}
