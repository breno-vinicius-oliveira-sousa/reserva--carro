package runner;

import org.junit.jupiter.api.Test;
import reserva.ReservaService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaServiceTest {

    ReservaService reservaService = new ReservaService();

    @Test
    void testReservaDentroDaArea() {
        String resultado = reservaService.reservar("Belo Horizonte", "Av. Afonso Pena");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void testReservaForaDaArea() {
        String resultado = reservaService.reservar("Rio de Janeiro", "Copacabana");
        assertEquals("Área fora de cobertura", resultado);
    }
}
