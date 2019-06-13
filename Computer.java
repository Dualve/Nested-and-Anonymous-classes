package com.company;

public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void turnOn() {
            isStart = true;
            System.out.println("PC is ON.");
            System.out.println(" ");
            System.out.println("Wait...");
            System.out.println("Wait...");
            System.out.println("Wait...");
            System.out.println(" ");
            kingston.turnOn();
        }

        public void turnOff() {
            isStart = false;
            System.out.println("PC is OFF.");
        }
    }

    class RAM {
        private boolean isStart = false;

        public void turnOn() {
            isStart = true;
            System.out.println("PC is start to work.");
        }

        public void turnOff() {
            isStart = false;
            System.out.println("PC is preparing to end.");
            System.out.println(" ");
            System.out.println("Wait...");
            System.out.println("Wait...");
            System.out.println("Wait...");
            System.out.println(" ");
            i7.turnOff();
        }
    }

    Proccessor i7 = new Proccessor();
    RAM kingston = new RAM();

}
