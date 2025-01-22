package Homework.HW_2025.HW_16012025.Task_2;

public class Student {

    private String name;
    private String surname;
    private int groupNumber;
    private boolean isOnline;

    public Student(String name, String surname, int groupNumber, boolean isOnline) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.isOnline = isOnline;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public int getGroupNumber() {return groupNumber;}

    public void setGroupNumber(int groupNumber) {this.groupNumber = groupNumber;}

    public boolean isOnline() {return isOnline;}

    public void setOnline(boolean online) {isOnline = online;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", isOnline=" + isOnline +
                '}';
    }

}
