package ua.senla.task3;

public class Main {

    public static void main(String[] args) {

        Cat finalName = new Cat();

        int count = 0;
        while (count < 10) {
            System.out.println("Cat's name - " + finalName.Name);
            System.out.println("Cat's age - " + finalName.AGE);
            count ++;
        }

        for (int i = 0; i < 10; i ++){
            finalName.setName("Kiska");
            finalName.setAge(7);
            System.out.println(finalName.getName() + " " + finalName.getAge());
        }

        Cat cats = new Cat();

        count = 0;
        do {
            System.out.println(cats.name2);
            System.out.println(cats.age2);
            count++;
        }while (count < 10);

        int [] arraysCat = new int[5];


        for (int i: arraysCat) {
            cats.setName("Bobi");
            cats.setAge(5);

            System.out.println(cats.getName());
            System.out.println(cats.getAge());

        }

    }
}
