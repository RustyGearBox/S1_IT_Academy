package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({"12345678, Z", "87654321, X", "21766040, J", "78764699, A", "87076304, Y", "12095566, G", "63190484, P", "51567382, W", "33264425, P", "30919505, F"})

    public void letterCalc(int dni, char letterExpected) {
        char letterObtained = CalculoDni.letterCalc(dni);
        assertEquals(letterExpected, letterObtained, "La lletra obtinguda no és correcta per al DNI " + dni);
    }
}
