package SummarySessions.SumSes_251024.ObjectsComparison.Example_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data implements Comparable<Data>{

    private String data;
    private int count;

    public Data(String data, int count){
        this.data = data;
        this.count = count;
    }

//    @Override
//    public int compareTo(Data another) {
//        return data.compareTo(another.data);//Comparison of current data with the data of another object.
//    }

    @Override
    public int compareTo(Data another) {                 //Direct sorting. Comparison with account for both fields.
        int result =  data.compareTo(another.data);
        if(result == 0){
            result = count - another.count;
        }
        return result;
    }

//    @Override
//    public int compareTo(Data another){                //Reverse sorting
//        int result = another.data.compareTo(data);
//        if(result == 0){
//            result = another.count - count;
//        }
//        return result;
//    }

    @Override
    public String toString() {
        return "Data{" +
                "data = '" + data + '\'' +
                ", count = " + count +
                '}';
    }

    public static void main(String[] args) {

        Data data1 = new Data("Stick", 12);
        Data data2 = new Data("Book", 25);
        Data data3 = new Data("Umbrella", 11);
        Data data4 = new Data("Coffee",52);
        Data data5 = new Data("Box", 32);

        List<Data> list = new ArrayList<>(List.of(data1, data2, data3, data4, data5));
        //Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

}
