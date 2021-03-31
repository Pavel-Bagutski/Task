package ua.senla.task5;

import ua.senla.task5.figure.AddDelete;
import ua.senla.task5.figure.Cylinder;
import ua.senla.task5.figure.Square;

public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        Ship ship = new Ship();

        Square square = new Square();

        Double[] arrShip1 = ship.createShip();
        for (int i = 0; i < arrShip1.length; i++) {
            System.out.println("arrship " + arrShip1[i]);
        }

        Double[] arrSquare = square.SquareArray();
        for (int i = 0; i < arrSquare.length; i++) {
            System.out.println("arr square " + arrSquare[i]);
        }




    }
}




