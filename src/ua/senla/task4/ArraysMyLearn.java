package ua.senla.task4;

import ua.senla.task2.Ranbow;

import java.util.Arrays;

public class ArraysMyLearn {

    int arr[][] = new int[5][5];

    public void method() {
        Ranbow ranbow = new Ranbow();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    } //Array in array

    public void print() {
        Ranbow ranbow = new Ranbow();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    } // print array in array

    // This is generation random String

    public void randomString() {

        String finishStr = "";
        String Str = "Arwjffcascp";

        int a = 0;
        while (a < 11) {
            int ramdStr = (int) (Math.random() * 11);
            finishStr = finishStr + Str.charAt(ramdStr);
            a++;
        }
        System.out.println(finishStr);

    }
    //String.charAt(i)

    public void BinSearch() {  //Only law arrays working
        int[] ExamlmeArr = new int[10];
        int number = 1;

        for (int i = 0; i < ExamlmeArr.length; i++) {
            ExamlmeArr[i] = number;
            number++;
        }

        int pos = Arrays.binarySearch(ExamlmeArr, 8); //count ?? search
        System.out.println(pos);

        for (int j = 0; j < ExamlmeArr.length; j++) {
            //System.out.println(ExamlmeArr[j]);
        }
        //binarySearch


    }
}
