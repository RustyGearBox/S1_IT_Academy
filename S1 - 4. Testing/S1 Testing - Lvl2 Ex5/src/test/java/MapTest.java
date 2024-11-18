import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    @Test
    public void testMapContainkey() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        assertTrue(map.containsKey("key2"),"The map has to contain the key -> 'key2'.");
    }

    @Test
    public void testMapDoesntContainkey() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        assertFalse(map.containsKey("key4"),"The map does not have to contain the key -> 'key4'.");
    }

}
