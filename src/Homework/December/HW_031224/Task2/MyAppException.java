package Homework.December.HW_031224.Task2;

public class MyAppException extends Exception{

    public MyAppException(String type, String message) {
        super("Type: " + type + "; Message: " + message);
    }
}
