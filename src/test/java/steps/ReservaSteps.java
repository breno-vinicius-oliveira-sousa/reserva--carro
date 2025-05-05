package steps;

import io.cucumber.java.pt.*;
import reserva.ReservaService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaSteps {

    private String cidade;
    private String endereco;
    private String resposta;
    private ReservaService reservaService = new ReservaService();

    @Dado("que o passageiro está em {string}")
    public void que_o_passageiro_está_em(String cidade) {
        this.cidade = cidade;
    }

    @Quando("ele solicita um carro para o endereço {string}")
    public void ele_solicita_um_carro_para_o_endereço(String endereco) {
        this.endereco = endereco;
        this.resposta = reservaService.reservar(cidade, endereco);
    }

    @Então("o sistema deve responder com {string}")
    public void o_sistema_deve_responder_com(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resposta);
    }
}
