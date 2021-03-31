package ua.senla.task5.figure;

import ua.senla.task5.RandomNumbers;

public class Cylinder {

    RandomNumbers randomNumbers = new RandomNumbers();
    Double v = new Double(0);
    Double s = new Double(0);
    Double size = new Double(0);
    Double m = new Double(0);

    public double cylinderRun() {
        cylinderSize();
        cylinderV();
        cylinderDestMass();
        return cylinderDestMass();
    }
    public double cylinderSize () {
        size = randomNumbers.randDiagonal(); // if S == 200 it is BIG if S == 50 it is small
        return size;
    }
    public double cylinderV () {
        s = 3.14 * ((size / 2) * (size / 2));
        v = randomNumbers.randHeight() * s;
        return v;
    }

    public double cylinderDestMass (){
        double destiny = randomNumbers.randomDensity(); //  destiny  1000 or 2000
        m = (v * destiny) / 1000;
        return m;
    }
}
