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

        System.out.println(" ");
        String [] shortArray = new String[5];
            int x = 0;
            int y = 0;
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);
            System.out.println(x + " " + y);
            for (int c = 0; c < shortArray.length; c++ ){
                x = (int)(Math.random() * 10);
                y = (int)(Math.random() * 10);
                shortArray [c] = arr [x][y];
            }


            //Need will work with - parse.double
        Double doubleone = new Double(0);
            double doubleArray [] = new double[5];
            String [] strArray = new String[5];
            int n = 0;
            int m = 0;
        for (int i = 0;i < shortArray.length; i++){
            try {
            //System.out.println(shortArray[i]);
            doubleone = Double.parseDouble(shortArray [i]);
            doubleArray [n] = doubleone;
            System.out.println( "intArray " + doubleArray[n]);
            n++;

        }   catch (NumberFormatException e){
                strArray [m] = shortArray[i];
                System.out.println("strArray " + shortArray[m]);
                m++;
            }
        }

            }

    }

