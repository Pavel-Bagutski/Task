package ua.senla.task8;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public interface MyList<Object> {


    void add(Object obj);// добавляет в список по индексу index объект obj
    boolean addAll(int index, MyList<? extends java.lang.Object> col); //: добавляет в список по индексу index все
    //элементы коллекции col. Если в результате добавления список был изменен, то
    //возвращается true, иначе возвращается false
    java.lang.Object get(int index);//: возвращает объект из списка по индексу index
    int indexOf(Object obj);//: возвращает индекс первого вхождения объекта obj в список. Если
    //объект не найден, то возвращается -1
    int lastIndexOf(Object obj);//: возвращает индекс последнего вхождения объекта obj в список.
    //Если объект не найден, то возвращается -1
    ListIterator<java.lang.Object> listIterator ();//: возвращает объект ListIterator для обхода элементов списка

    static <Object> List<java.lang.Object> of()//: создает из набора элементов объект List
    {
        return null;
    }

    Object remove(int index);//: удаляет объект из списка по индексу index, возвращая при этом
    //удаленный объект
    Object set(int index, Object obj);//: присваивает значение объекта obj элементу, который находится по
    //индексу index
    void sort(Comparator<? super java.lang.Object> comp);//: сортирует список с помощью компаратора comp
    List<Object> subList(int start, int end);

}
