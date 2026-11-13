package padroescomportamentais.chainofresponsability;

public class SuporteEngenheiro extends Suporte {

    public SuporteEngenheiro(Suporte proximoNivel) {
        chamadosAtendidos.add(TipoChamadoRede.getTipoChamadoRede());
        setProximoNivel(proximoNivel);
    }

    public String getDescricaoNivel() {
        return "Engenheiro";
    }
}
