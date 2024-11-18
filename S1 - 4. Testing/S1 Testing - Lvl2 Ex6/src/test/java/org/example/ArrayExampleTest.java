package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayExampleTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {

        ArrayExample arrayExample = new ArrayExample();

        int[] array = {1,2,3,4,5};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {arrayExample.getElementAtIndex(array, 10);},
                "ArrayIndexOutOfBoundsException should be thown to access a index out of limits.");
    }

}
