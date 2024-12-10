package Homework.October.HW_241024.Task_3_OwnClassList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //    3. Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

        Aircraft boing = new Aircraft("Boing-747", "Medium", 2000);
        Aircraft IL = new Aircraft("IL-72", "Long", 1986);
        Aircraft TU = new Aircraft("Tu-154", "Medium", 1995);
        Aircraft airbus = new Aircraft("Airbus a380", "Long", 2014);
        Aircraft AN = new Aircraft("AN-12", "short", 1984);

        LinkedList<Aircraft> aircrafts = new LinkedList<>();

        aircrafts.add(boing);
        aircrafts.add(IL);
        aircrafts.add(TU);
        aircrafts.add(airbus);
        aircrafts.add(AN);

        System.out.println(aircrafts);

        for (int i = 0; i<aircrafts.size(); i++){
            if(aircrafts.get(i).getYearOfManufacture() < 2000 || aircrafts.get(i).getModel().equals("Boing-747")){
                aircrafts.remove();
            }
        }

        System.out.println(aircrafts);
    }
}
