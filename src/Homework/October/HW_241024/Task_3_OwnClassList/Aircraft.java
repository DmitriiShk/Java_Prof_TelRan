package Homework.October.HW_241024.Task_3_OwnClassList;

public class Aircraft {
    private String model;
    private String range;
    private int yearOfManufacture;

    public Aircraft(String model, String range, int yearOfManufacture){
        this.model = model;
        this.range = range;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public String getRange() {
        return range;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "model = '" + model + '\'' +
                ", range = '" + range + '\'' +
                ", yearOfManufacture = " + yearOfManufacture +
                '}';
    }
}
