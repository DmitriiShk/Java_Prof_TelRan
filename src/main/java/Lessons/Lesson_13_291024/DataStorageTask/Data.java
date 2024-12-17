package Lessons.Lesson_13_291024.DataStorageTask;

public class Data {

    String data;

    int count;

    public Data(String data, int count) {
        this.data = data;
        this.count = count;
    }


    public int compareTo(Data another){
        int result = data.compareTo((another.data));
        if(result == 0) {
            result = count = another.count;
        }
        return result;
    }


    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                ", count=" + count +
                '}';
    }
}
