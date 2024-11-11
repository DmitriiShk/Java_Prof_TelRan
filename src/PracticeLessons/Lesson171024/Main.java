package PracticeLessons.Lesson171024;

import java.util.*;

public class Main {

    // Задача: 1. В стране Лимпопо количество всех зверей равно 10 миллионов.
    //Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
    //Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
    //что показатели рождаемости и смертности постоянны.

    public static void main(String[] args) {

        List<Integer> animalsLimpopo = new ArrayList<>(1000000);

        for(int i = 1; i<=1_000_000; i++){
            animalsLimpopo.add(i);
        }

        System.out.println("Number of animals in Limpopo. Year 1: " + animalsLimpopo.size());

        int year = 10;
        int mortalityRate = 8;
        int birthRate = 14;
        int total = 1000;
        int lastAnimal = animalsLimpopo.size()-1;

        for (int i = 0; i < year; i++) {
            ListIterator<Integer> listIterator = animalsLimpopo.listIterator();

            int deathCount = 0; //Number of animals for the purpose of removal because of death;
            int birthCount = 1; //Number of animuals for the purpose of new animals addition due to birth;
             //Index of the last element in the array;

            while(listIterator.hasNext()){
                listIterator.next(); //Перемещение на элемент
                deathCount++;
                birthCount++;
                if(deathCount == total/mortalityRate){
                    listIterator.remove();
                    deathCount=0;
                }
                if(birthCount == total/birthRate){
                    listIterator.add(++lastAnimal);
                    birthCount = 0;
                }

            }

            System.out.println("Number of animals in Limpopo in " + (i+1) + " year: " + animalsLimpopo.size());

        }

        System.out.println();

        System.out.println("Number of animals in Limpopo in 10 years: " + animalsLimpopo.size());
//        animalsLimpopo.sort(Integer::compareTo);
//        System.out.println(lastAnimal);
//        System.out.println("Number of the last animal " + animalsLimpopo.get(animalsLimpopo.size()-1));

    }




}
