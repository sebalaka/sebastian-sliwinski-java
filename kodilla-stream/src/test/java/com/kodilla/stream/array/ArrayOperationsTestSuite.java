package com.kodilla.stream.array;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] array = new int[20];
        array[0] = 3;
        array[1] = 1;
        array[2] = 1;
        array[3] = 4;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 11;
        array[9] = 1;
        array[10] = 1;
        array[11] = 1;
        array[12] = 1;
        array[13] = 5;
        array[14] = 1;
        array[15] = 1;
        array[16] = 1;
        array[17] = 1;
        array[18] = 1;
        array[19] = 1;
        //When
        double average = ArrayOperations.getAverage(array);
        //Then
        assertEquals(2,average,0.1);
    }
}
