package ua.senla.task5;

public class CreateConteiner {
    RandomNumbers randomNumbers = new RandomNumbers();

    Double s = new Double(0);

    public double squareContainer() {
        double size = randomNumbers.randDiagonal();
        s = 0.5 * (size * size); // if S == 200 it is BIG if S == 50 it is small
        double v = randomNumbers.randHeight() * s;
        System.out.println(v);
        double destiny = randomNumbers.randomDensity(); //  destiny  1000 or 2000
        double m = (v * destiny) / 1000;
        return m;
    }
    public double cylinderContainer() {
        double size = randomNumbers.randDiagonal(); // if S == 200 it is BIG if S == 50 it is small
        s = 3.14 * ((size/2)*(size/2));
        double v = randomNumbers.randHeight() * s;
        System.out.println(v);
        double destiny = randomNumbers.randomDensity(); //  destiny  1000 or 2000
        double m = (v * destiny) / 1000;
        System.out.println(m);
        return m;
    }

    public double coneContainer() {
        double size = randomNumbers.randDiagonal(); // if S == 200 it is BIG if S == 50 it is small
        s = 3.14 * ((size/2)*(size/2));
        double v = (randomNumbers.randHeight()/3) * s;
        System.out.println(v);
        double destiny = randomNumbers.randomDensity(); //  destiny  1000 or 2000
        double m = (v * destiny) / 1000;
        System.out.println(m);
        return m;
    }

}
