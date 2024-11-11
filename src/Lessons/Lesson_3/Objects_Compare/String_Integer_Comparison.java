package Lessons.Lesson_3.Objects_Compare;

import java.util.Objects;

public class String_Integer_Comparison {

    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");

        //String pool
        System.out.println("1) " + (s1==s2)); //True, while both s1 and s2 refer to one and the same object created in String pool within a heap.
        System.out.println("2) " + (s1==s3)); //If we use constructor, we specify that we want to create another object not in the String pool but in heap, that is why s1 and s3 refer to different objects.
        s3 = s3.intern();// this method intern() is used to include the String object into the String pool.
        System.out.println("3) After s3 inclusion into String pool: " + (s1==s3));
        
        System.out.println("4) " + s1.equals(s2)); //Here we compare content (the value of the variables) not reference. That is why we get True.
        System.out.println("5) " + s1.equals(s3));

        System.out.println();
        System.out.println("Integer pool");
        //Integer pool
        Integer i1 = 1;
        Integer i2 = 1;
        Integer i3 = 128; //Not all integers get into Integer pool. All values from -128 to 127 are included into integer pool. All the other not included.
        Integer i4 = 128;

        System.out.println("1) " + (i1==i2));
        System.out.println("2) " + i1.equals(i2));
        System.out.println("3) " + (i3==i4)); //Since 128 is not included into the Integer pool, here we compare references.
        System.out.println("4) " + i3.equals(i4)); //All reference types should be compared by equal() method.
                                                   //The safest method of comparison is Objects.equals(i3, i4).
        System.out.println("5) " + Objects.equals(i3, i4));


    }

}
