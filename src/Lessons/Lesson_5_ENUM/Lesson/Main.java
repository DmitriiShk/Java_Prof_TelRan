package Lessons.Lesson_5_ENUM.Lesson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var color = Color.RED;
        System.out.println(color);
        var color1 = Color.BLUE;
        System.out.println("Color 1 = " + color1);

        var season = Season.FALL;
        System.out.println("Season = " + season);
        System.out.println(season); //Overridden toString() method
        System.out.println(season.name()); //Outputs the season name
        System.out.println(season.ordinal());//Outputs number of the season in the list (from 0 to end)
        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
        System.out.println(Season.valueOf("SUMMER"));


        var errorCode = ErrorCode.NOT_FOUND;
        System.out.println("Error code = " + errorCode);
        int code = errorCode.getCode();
        String message = errorCode.getMessage();
        System.out.println(errorCode);

    }

}