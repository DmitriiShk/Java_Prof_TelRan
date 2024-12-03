package Lessons.Lesson_22_261124.Tasks;


public class Box<Item> {

    private Item item;

    public Box(){}

    public Box(Item item) {this.item = item;}

    public void put(Item item) {this.item = item;}

    public Item get() {return item;}

    public Item remove() {
        Item temp = item;
        item = null;
        return temp;
    }

   public boolean isEmpty() {
        return item == null;
    }

    @Override
    public String toString() {
        return "Box {" +
                "item = " + item +
                '}';
    }

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);
        System.out.println(integerBox);
        System.out.println("Get: " + integerBox.get());
        System.out.println("Is empty: " + integerBox.isEmpty());
        System.out.println("Remove: " + integerBox.remove());
        System.out.println("Is empty: " + integerBox.isEmpty());

    }

}

