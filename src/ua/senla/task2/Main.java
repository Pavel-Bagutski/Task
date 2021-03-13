package ua.senla.task2;

import ua.senla.task2.Ranbow;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Ranbow ranbow = new Ranbow();
        System.out.println("You may use next color:  1 " + ranbow.red + ", 2 " + ranbow.orange + ", 3 " + ranbow.yellow +
                ", 4 " + ranbow.green + ", 5 " + ranbow.blue + ", 6 " + ranbow.purple);

        System.out.println("How much you would have color 1 or 2?");
        int numbcolor = scan.nextInt();
        if (numbcolor == 1) {
            System.out.println("Enter your number! ");
            int press = scan.nextInt();
            while (press < 1 || press > 6) {
                System.out.println("Your number isn't correct");
                press = scan.nextInt();
            }
            ranbow.function1(press);
            System.out.println();
        }
        else{
            System.out.println("Enter your number 1 ! ");
            int enter1 = scan.nextInt();
            System.out.println("Enter your number 2 ! ");
            int enter2 = scan.nextInt();
            ranbow.function1(enter1, enter2);
        }
    }
}