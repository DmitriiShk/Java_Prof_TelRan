package Lessons.Lesson_121224;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void findCommonElements() {

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        List<Integer> expected = List.of(1, 7);
        List<Integer> result = Task1.findCommonElements(array1, array2);
        assertEquals(expected, result);
    }
}