package Lessons.Lesson_11_221024.LocalClass;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ProcessData {

    public void process(List<Integer> data){

        class Rectangle{
            int length;
            int width;

            public Rectangle(int length, int width) {
                this.length = length;
                this.width = width;
            }

            public int rectangleSquare(){
                return length*width;
            }
        }

        Rectangle rectangle = new Rectangle(data.get(1), data.get(2));
        Rectangle rectangle1 = new Rectangle(data.get(4), data.get(7));
        int square1 = rectangle.rectangleSquare();
        int square2 = rectangle1.rectangleSquare();

        System.out.println("Total square of figures: " + square1 + square2);
    }

    public static void main(String[] args) {

//        ProcessData processData = new ProcessData();
//        List<Integer> data = new ArrayList<>(List.of(1, 3, 5, 7));
//        processData.process(data);


    }

}
