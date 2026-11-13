package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    SuporteEngenheiro engenheiro;
    SuporteTecnico tecnico;
    SuporteAtendente atendente;

    @BeforeEach
    void setUp() {
        engenheiro = new SuporteEngenheiro(null);
        tecnico = new SuporteTecnico(engenheiro);
        atendente = new SuporteAtendente(tecnico);
    }

    @Test
    void deveRetornarAtendenteParaChamadoSenha() {
        assertEquals("Atendente", atendente.resolverChamado(new Chamado(TipoChamadoSenha.getTipoChamadoSenha())));
    }

    @Test
    void deveRetornarTecnicoParaChamadoHardware() {
        assertEquals("Técnico", atendente.resolverChamado(new Chamado(TipoChamadoHardware.getTipoChamadoHardware())));
    }

    @Test
    void deveRetornarEngenheiroParaChamadoRede() {
        assertEquals("Engenheiro", atendente.resolverChamado(new Chamado(TipoChamadoRede.getTipoChamadoRede())));
    }

    @Test
    void deveRetornarNaoResolvidoParaChamadoJuridico() {
        assertEquals("Chamado não resolvido", atendente.resolverChamado(new Chamado(TipoChamadoJuridico.getTipoChamadoJuridico())));
    }
}
