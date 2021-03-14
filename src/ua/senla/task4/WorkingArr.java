package ua.senla.task4;

import ua.senla.task2.Ranbow;

import java.util.Random;

public class WorkingArr {

    String arr[][] = new String[10][10];


    public void method() {
        Random random = new Random();
        String ranStr1 = new String("qazwsxedcrfvtgbyhnujmikolp");
        String ramNumStr = new String(".0123456789");
        String finalString2 = new String("");
        String finalString1 = new String("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if ((i + j) % 2 == 0) {
                    finalString1 = "";
                    for (int q = 0; q < 6; q++) {                   //Litters
                        int a = (int) (Math.random() * 26);
                        finalString1 = finalString1 + ranStr1.charAt(a);
                        arr[i][j] = finalString1;
                    }
                } else {
                    finalString2 = "";
                    for (int w = 0; w < 6; w++) {                     //Numbers
                        int a = (int) (Math.random() * 10);
                        finalString2 = finalString2 + ramNumStr.charAt(a);
                        arr[i][j] = finalString2;

                    }
                }

            }
        }
            for (int r = 0; r < arr.length; r++) {
                System.out.println(" ");
                for (int t = 0; t < arr[r].length; t++) {
                    System.out.print(arr[r][t] + " ");

                }
            }

        }
    }
