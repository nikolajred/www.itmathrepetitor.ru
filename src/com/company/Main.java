package com.company;

import javax.swing.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        solution_1();
        solution_2();
        solution_3();
        solution_4();
        solution_5();
        solution_6();


    }

    public static void solution_1() {
        System.out.println("Silence is gold");
    }

    public static void solution_2() {
        Date date = new Date();
        int day = date.getDay();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        int month = date.getMonth() + 1;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        String name = JOptionPane.showInputDialog("Pleas, input your name and press enter");
        System.out.println(name);
    }

    public static void solution_3() {
        byte[] zero = {0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print(zero[j]);
            }
        }
    }
    public static void solution_4(){
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 8; j++) {
                System.out.print(" A ");

            }

        }
        System.out.println();
    }
    public static void solution_5(){
        System.out.println("**              **              **");
        System.out.println("  **          **  **          **");
        System.out.println("    **      **      **      **");
        System.out.println("      **  **          **  **");
        System.out.println("        **              **");
    }
    public static void solution_6(){
        int answer = 1 + 2 - 4;
        System.out.println(answer);
    }
}
