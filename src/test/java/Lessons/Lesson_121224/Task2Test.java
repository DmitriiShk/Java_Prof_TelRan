package Lessons.Lesson_121224;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void removeDuplicates() {
        int[] input = {0, 3, -2, 4, 3, 2};
        int[] expected = {0, 3, -2, 4, 2};
        int[] result = Task2.removeDuplicates(input);
        assertArrayEquals(expected, result);
    }
}