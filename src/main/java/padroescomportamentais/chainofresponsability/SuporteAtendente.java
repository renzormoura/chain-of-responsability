package padroescomportamentais.chainofresponsability;

public class SuporteAtendente extends Suporte {

    public SuporteAtendente(Suporte proximoNivel) {
        chamadosAtendidos.add(TipoChamadoSenha.getTipoChamadoSenha());
        setProximoNivel(proximoNivel);
    }

    public String getDescricaoNivel() {
        return "Atendente";
    }
}
