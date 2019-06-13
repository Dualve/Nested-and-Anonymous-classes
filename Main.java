package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char YES = 'y', NO = 'n', response;

        Computer PC = new Computer();
        PC.i7.turnOn();
        while (true){
            System.out.println(" ");
            System.out.println("Do you want to end? (y/n)");
            Scanner answer = new Scanner(System.in);
            response = answer.next().charAt(0);
            if (response == YES){
                PC.kingston.turnOff();
                break;
            }
            else{
                System.out.println(" ");
                System.out.println("PC is working...");

            }

        }

        System.out.println(" ");
        System.out.println(" ");

        new Computer(){
            void superPC(){
                System.out.println("Super-PC preparing to start.");
                this.i7.turnOn();
                System.out.println("");
                this.kingston.turnOff();
            }
        }.superPC();

    }

}

