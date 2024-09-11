package org.example;

public class Main {
    public static void main(String[] args) {
        MultithreadThing multithreadThing = new MultithreadThing();
        Thread myThread = new Thread(multithreadThing);
        System.out.println(myThread.isAlive());
        myThread.start();
        System.out.println(myThread.isAlive());
    }
}