package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Thread toyThred = new Thread(null, new Toy(), "Коробка");
        toyThred.start ();

        final Thread peopleThred = new Thread (null, new People (), "Игрок");
        peopleThred.start ();

        peopleThred.join ();
        if(!peopleThred.isAlive ()){
            System.out.println ("Поток Игрок завершен");
            toyThred.interrupt ();
        }

        toyThred.join (1000);
        if (!toyThred.isAlive ()){
            System.out.println ("Поток Игрушка завершен");
        }
    }
}
