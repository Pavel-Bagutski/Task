package ua.senla.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main (String [] args){
        MyArrayList<Object> list = new MyArrayList();

        list.add(new People("Joy", 40));
        list.add(new People("Jack", 34));
        list.add(new People("Sam", 45));
        list.add(new People("Alex", 74));

        System.out.println(list);
        System.out.println(new People("fsfa", 2));
    }
}
