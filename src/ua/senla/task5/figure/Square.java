package ua.senla.task5.figure;

import ua.senla.task5.RandomNumbers;

public class Square {

    RandomNumbers randomNumbers = new RandomNumbers();
    Double s;
    Double v;
    Double m;
    Double size;

    Double [] arraySquare  = new Double[1];

    public Double[] SquareArray(){
        if (squareSize() < 10) {
            squareV();
            arraySquare = new Double[1];
            arraySquare[0] = squareDestMass();
        }else {
            squareV();
            arraySquare = new Double[2];
            double x = squareDestMass();
            arraySquare [0] = x/2;
            arraySquare [1] = x/2;
        }
        return  arraySquare ;
    }
    public double squareSize () {
        size = randomNumbers.randDiagonal();// if S == 200 it is BIG if S == 50 it is small
        return size;
    }
    public double squareV () {
        s = 0.5 * (size * size);
        v = randomNumbers.randHeight() * s;
        return v;
    }
    public double squareDestMass (){
        double destiny = randomNumbers.randomDensity(); //  destiny  1000 or 2000
        double m = (v * destiny) / 1000;
        return m;
    }
}
