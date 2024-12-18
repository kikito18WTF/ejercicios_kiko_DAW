package org.example;

import static org.junit.jupiter.api.Assertions.*;

class NocheviejaTest {

    @org.junit.jupiter.api.Test
    void MEDIANOCHE() {
        assertTrue(Nochevieja.medianoche("00:00");
        assertFalse(Nochevieja.medianoche("23:59");
        assertFalse(Nochevieja.medianoche("12:00");
    }

    @org.junit.jupiter.api.Test
    void calcularMinutos() {
        assertEquals(15, Nochevieja.calcularMinutos("23:45");
        assertEquals(150, Nochevieja.calcularMinutos("21:30");
        
        assertEquals(-1, Nochevieja.calcularMinutos("25:00");
        assertEquals(-1, Nochevieja.calcularMinutos("23:60");
        assertEquals(-1, Nochevieja.calcularMinutos("12:61");
        assertEquals(-1, Nochevieja.calcularMinutos("invalid");
    }
}
