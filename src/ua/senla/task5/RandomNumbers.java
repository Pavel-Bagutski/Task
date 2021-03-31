package ua.senla.task5;

import java.util.Random;

public class RandomNumbers implements Figurdata {

    Random random = new Random();
    final double BIG_DIAGONAL = 20;
    final double SMALL_DIAGONAL = 10;
    public double getRandomDiagonal = 0;
    public double BIG_P = 2000;
    public double SMALL_P = 1000;
    public double getrandDenst = 0;
    public double height = 0;

    public double randomDensity (){
        double x = (double)(Math.random() * 10+1);
        if (x < 5){
            getrandDenst = SMALL_P;
        }else {
            getrandDenst = BIG_P;
        }

        return getrandDenst;
    }

    public double randDiagonal (){
        double x = (double) (Math.random() * 10+1);
        if (x < 5){
            getRandomDiagonal = SMALL_DIAGONAL;
        }else {
            getRandomDiagonal = BIG_DIAGONAL;
        }
        return getRandomDiagonal;
    }

    public double randHeight (){
        double height = (double)(Math.random() * 100 + 1);
            while (height < 10 && height > 25) {
                height = (double)(Math.random() * 100 + 1);
        }
            return height;
    }



    @Override
    public void volume() {

    }

    @Override
    public void area() {

    }
}
