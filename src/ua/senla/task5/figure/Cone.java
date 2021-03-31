package ua.senla.task5.figure;

import ua.senla.task5.RandomNumbers;

public class Cone {

    RandomNumbers randomNumbers = new RandomNumbers();
    Double size;
    Double s;
    Double v;
    Double m;

    public void ConeRun() {
        coneSize();
        coneV();
        coneDestMass();
    }
    public double coneSize (){
        size = randomNumbers.randDiagonal();
        return size;
    }
    public double coneV() {
        s = 3.14 * ((size / 2) * (size / 2));
        v = (randomNumbers.randHeight() / 3) * s;
        return v;
    }
    public double coneDestMass (){
        double destiny = randomNumbers.randomDensity(); //  destiny  1000 or 2000
        double m = (v * destiny) / 1000;
        System.out.println(m);
        return m;
    }
}
