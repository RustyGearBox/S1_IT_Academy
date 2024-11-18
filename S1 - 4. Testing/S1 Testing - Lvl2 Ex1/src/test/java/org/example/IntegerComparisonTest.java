package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerComparisonTest {

    @Test
    public void testValuesAreEqual() {
        IntegerComparison comparison = new IntegerComparison(5, 5);
        assertTrue(comparison.areEqual(), "Both values should be equals");
    }

    @Test
    public void testValuesAreNotEqual() {
        IntegerComparison comparison = new IntegerComparison(5, 10);
        assertFalse(comparison.areEqual(), "Both values should be different");
    }

    @Test
    public void testEqualityUsingAssertEquals() {
        IntegerComparison comparison = new IntegerComparison(8, 8);
        assertEquals(comparison.getValue_1(), comparison.getValue_2(), "Both objects Integer should be equals");
    }

    @Test
    public void testInequalityUsingAssertNotEquals() {
        IntegerComparison comparison = new IntegerComparison(3, 7);
        assertNotEquals(comparison.getValue_1(), comparison.getValue_2(), "Both objects Integer should be different");
    }
}
