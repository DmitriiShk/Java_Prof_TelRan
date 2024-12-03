package PracticeLessons.Lesson261124.Tasks.Task3_Comparator;

public class NumberBox<T extends Number> {

    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public double sum(NumberBox<? extends Number> another) {
        return this.value.doubleValue() + another.getValue().doubleValue();
    }
}

