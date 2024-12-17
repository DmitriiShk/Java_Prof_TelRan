package Homework.HW3_School;

public class Teacher {

    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void teach (Student student){
        System.out.println("Teacher " + name + " teaches " + subject + " to student " + student.getName() + ".");
        student.learnt(subject);
    }

    public void teach (Student[] students){
        for (Student student : students) {
            teach(student);
        }
    }

    @Override
    public String toString(){
        return "Teacher:\n    Name: " + name + "\n    Subject: " + subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

}
