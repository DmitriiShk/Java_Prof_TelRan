package PracticeLessons.Lesson301024.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "Radar"; //Madam, Rotor,

        System.out.println(palindromeCheck(str));
        //System.out.println(isPalindrome(str));

    }

    public static boolean palindromeCheck(String word){

        String s = word.toLowerCase();

        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean isPalindrome(String word){

        String w = word.toLowerCase();

        int first = 0; //или просто 0
        int last = w.length()-1;

        while (first < last){
            char fl = w.charAt(first);
            char ll = w.charAt(last);
            if(fl != ll) return false;
            else {
                first++;
                last--;
            }
        }
        return true;
    }


}
