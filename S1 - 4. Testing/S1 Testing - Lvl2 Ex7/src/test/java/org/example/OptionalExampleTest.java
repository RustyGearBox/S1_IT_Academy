package org.example;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class OptionalExampleTest {

    @Test
    public void testOptionalEmpty() {
        OptionalExample optionalExample = new OptionalExample();
        Optional<String> optionalEmpty = optionalExample.getOptionalEmpty();

        assertTrue(optionalEmpty.isEmpty(), "Optional should be empty");
    }

}