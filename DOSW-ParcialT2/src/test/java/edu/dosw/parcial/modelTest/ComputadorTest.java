package edu.dosw.parcial.modelTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ComputadorTest {

    @Test
    void shouldReturnOnlyOccupiedComputadores() {
        // Arrange
        List<Computador> computadores = new ArrayList<>();

        Computador pc1 = new Computador();
        pc1.setOcupado(true);

        Computador pc2 = new Computador();
        pc2.setOcupado(false);

        Computador pc3 = new Computador();
        pc3.setOcupado(true);

        computadores.add(pc1);
        computadores.add(pc2);
        computadores.add(pc3);
        long cantidadOcupados = computadores.stream()
                .filter(Computador::getOcupado)
                .count();
        assertEquals(2, cantidadOcupados);
    }
}