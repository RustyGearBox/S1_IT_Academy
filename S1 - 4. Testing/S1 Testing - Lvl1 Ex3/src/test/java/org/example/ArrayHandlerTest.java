package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayHandlerTest {

    @Test
    void testArrayIndexOutOfBounds() {
        int[] testArray = {1, 2, 3, 4, 5};
        ArrayHandler arrayHandler = new ArrayHandler(testArray);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAtIndex(10);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAtIndex(-1);
        });
    }
}