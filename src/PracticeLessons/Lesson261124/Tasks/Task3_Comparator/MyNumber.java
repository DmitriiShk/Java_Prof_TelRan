package PracticeLessons.Lesson261124.Tasks.Task3_Comparator;

public class MyNumber implements MyComparable<MyNumber> {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyNumber another) {
        return Integer.compare(this.value, another.getValue());
    }

    @Override
    public String toString() {
        return "MyNumber {" + "value = " + value + '}';
    }

}

