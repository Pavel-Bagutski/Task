package ua.senla.task5;

public class Ship {

    final Double SHIP_SMALL = new Double(4);
    final Double SHIP_BIG = new Double(8);
    Double ship = new Double(0);
    private Double arrayShip [] = new Double[4];


    public Double [] createShip (){
        double counter =(double)(Math.random() * 10 + 1);
        if (counter<5){
            arrayShip = new Double[4];
        }else {
            arrayShip = new Double[8];
        }
        return arrayShip;
    }

}
























