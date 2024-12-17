package Lessons.Lesson_11_221024.InnerClass;

public class Cat {

    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    class Kitten{

        private String kittenName;

        public Kitten(String kittenName){
            this.kittenName = kittenName;
        }

        public String getName() {
            return kittenName;
        }
        public void setName(String kittenName) {
            this.kittenName = name;
        }

        @Override
        public String toString() {
            return "Kitten{" +
                    "name= '" + kittenName + '\'' + "; "
                    + "mother's name= '" + name + '\'' +
                    '}';
        }
    }

}
