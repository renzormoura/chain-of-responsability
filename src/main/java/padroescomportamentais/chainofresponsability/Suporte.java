package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;
import java.util.List;

public abstract class Suporte {

    protected List<TipoChamado> chamadosAtendidos = new ArrayList<>();
    private Suporte proximoNivel;

    public Suporte getProximoNivel() {
        return proximoNivel;
    }

    public void setProximoNivel(Suporte proximoNivel) {
        this.proximoNivel = proximoNivel;
    }

    public abstract String getDescricaoNivel();

    public String resolverChamado(Chamado chamado) {
        if (chamadosAtendidos.contains(chamado.getTipoChamado())) {
            return getDescricaoNivel();
        }
        else {
            if (proximoNivel != null) {
                return proximoNivel.resolverChamado(chamado);
            }
            else {
                return "Chamado não resolvido";
            }
        }
    }
}
