import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArraysSame() {
        int[] array_1 = {1,2,3,4,5};
        int[] array_2 = {1,2,3,4,5};
        assertArrayEquals(array_1, array_2, "Both arrays should be the same");
    }

    @Test
    public void testArraysDiff() {
        int[] array_1 = {1,2,3,4,5};
        int[] array_2 = {1,2,3,4,6};
        assertThrows(AssertionError.class, () -> assertArrayEquals(array_1, array_2), "Both arrays should be the different");
    }

}