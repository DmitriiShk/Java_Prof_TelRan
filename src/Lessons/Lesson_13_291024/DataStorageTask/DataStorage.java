package Lessons.Lesson_13_291024.DataStorageTask;

public class DataStorage implements Comparable<DataStorage> {

    private Data data;

    private Double weight;

    private int version;

    private boolean isActive;

    public DataStorage(Data data, Double weight, int version, boolean isActive) {
        this.data = data;
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }

    @Override
    public int compareTo(DataStorage anotherObject) {
//        this.data.getCount();
//        this.data.getData();
        int result = this.data.compareTo(anotherObject.data);
        if (result == 0) {
            return result = this.weight.compareTo(anotherObject.weight); //Нестатический метод. Вызывается на объекте.
            // result = this.weight < anotherObject.weight ? -1 : this.weight == another.weight ? 0 : 1;  // Самостоятельная реализация сравнения.
        }
        if (result == 0) {
            result = Integer.compare(this.version, anotherObject.version); //Метод без состояния (без объекта) или статический метод
            //result = this.version - anotherObject.version; //Этот самописный метод может дать ошибку в результате выхода за пределы диапазона
            //result = this.version < anotherObject.version ? -1 : this.version == anotherObject.version ? 0 : 1; //Этот самописный метод не даст ошибки.
        }
        if (result == 0) {
//          result = this.isActive ? (!another.isActive ? 1 : 0) : (!another.isActive) ? 0: -1;

            result = Boolean.compare(this.isActive, anotherObject.isActive);

        }

        return result;
    }

    @Override
    public String toString() {
        return "DataStorage{" +
                "data=" + data +
                ", weight=" + weight +
                ", version=" + version +
                ", isActive=" + isActive +
                '}';
    }
}