package org.example;

import static org.junit.jupiter.api.Assertions.*;

class NocheviejaTest {

    @org.junit.jupiter.api.Test
    void MEDIANOCHE() {
        assertTrue(Nochevieja.MEDIANOCHE("00:00"), "Debe devolver true para '00:00'");
        assertFalse(Nochevieja.MEDIANOCHE("23:59"), "Debe devolver false para '23:59'");
        assertFalse(Nochevieja.MEDIANOCHE("12:00"), "Debe devolver false para '12:00'");
    }

    @org.junit.jupiter.api.Test
    void calcularMinutos() {
        assertEquals(15, Nochevieja.calcularMinutos("23:45"), "Debe devolver 15 minutos para '23:45'");
        assertEquals(150, Nochevieja.calcularMinutos("21:30"), "Debe devolver 150 minutos para '21:30'");

        // Casos de prueba con formato incorrecto
        assertEquals(-1, Nochevieja.calcularMinutos("25:00"), "Debe devolver -1 para hora inválida '25:00'");
        assertEquals(-1, Nochevieja.calcularMinutos("23:60"), "Debe devolver -1 para minuto inválido '23:60'");
        assertEquals(-1, Nochevieja.calcularMinutos("12:61"), "Debe devolver -1 para minuto inválido '12:61'");
        assertEquals(-1, Nochevieja.calcularMinutos("invalid"), "Debe devolver -1 para formato inválido 'invalid'");
    }
}
