package SummarySessions.December.SumSes_061224.Tasks;

public class Task1 {

    /*
    1) Имеется текст "Php is the best programming language in the world. I study php."
       Замените в нем php на java.
     */

    public static void main(String[] args) {

        String text = "Php is the best programming language in the world. I study php.";
        String result = text.replaceAll("(?i)php", "java");
        System.out.println(result);
    }

}
