package Lessons.Lesson_22_261124;

public class GenericClass<Parameter> {

    private Parameter data;

    public GenericClass(Parameter data) {
        this.data = data;
    }

    public Parameter getData() {
        return data;
    }

    public Parameter nonStaticMethod(){
        System.out.println(data);
        System.out.println("Class of data: " + data.getClass());
        return data;
    }

    public void nonStaticMethod2(Parameter parameter){
        System.out.println("Input: " + parameter);
        System.out.println(parameter.getClass());
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}
