package ua.senla.task2;


import java.util.Scanner;

public class Ranbow {

    //  two methods, if & switch, const
    // red, orange, yellow, green, blue, purple

    String red = "red";
    String orange = "orange";
    String yellow = "yellow";
    String green = "green";
    String blue = "blue";
    String purple = "purple";


    Scanner scan = new Scanner(System.in);


    int count = 0;

    public void setCount(int count) {
        System.out.println("Enter count color, 1 or 2 ");
        while (count >= 1 || count <= 2) {
            count = scan.nextInt();
            this.count = count;
        }
    }

    int number;

    public void function1(int number) {
        String color;
        switch (number) {
            case 1:
                color = "red";
                System.out.println("red");
                break;
            case 2:
                color = "orange";
                System.out.println("orange");
                break;
            case 3:
                color = "yellow";
                System.out.println("yellow");
                break;
            case 4:
                color = "green";
                System.out.println("green");
                break;
            case 5:
                color = "blue";
                System.out.println("blue");
                break;
            case 6:
                color = "purple";
                System.out.println("purple");
                break;
        }


    }

    int number2;

    public void function1(int number, int number2) {
        String color;

        switch (number) {
            case 1:
                color = "red";
                System.out.print("red - ");
                break;
            case 2:
                color = "orange";
                System.out.print("orange - ");
                break;
            case 3:
                color = "yellow";
                System.out.print("yellow - ");
                break;
            case 4:
                color = "green";
                System.out.print("green - ");
                break;
            case 5:
                color = "blue";
                System.out.print("blue - ");
                break;
            case 6:
                color = "purple";
                System.out.print("purple - ");
                break;
        }

        String color2;

        switch (number2) {
            case 1:
                color2 = "red";
                System.out.println("red");
                break;
            case 2:
                color2 = "orange";
                System.out.println("orange");
                break;
            case 3:
                color2 = "yellow";
                System.out.println("yellow");
                break;
            case 4:
                color2 = "green";
                System.out.println("green");
                break;
            case 5:
                color2 = "blue";
                System.out.println("blue");
                break;
            case 6:
                color2 = "purple";
                System.out.println("purple");
                break;
        }
    }
}



