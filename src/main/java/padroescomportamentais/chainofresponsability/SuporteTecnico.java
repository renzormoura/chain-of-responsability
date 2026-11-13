package padroescomportamentais.chainofresponsability;

public class SuporteTecnico extends Suporte {

    public SuporteTecnico(Suporte proximoNivel) {
        chamadosAtendidos.add(TipoChamadoHardware.getTipoChamadoHardware());
        setProximoNivel(proximoNivel);
    }

    public String getDescricaoNivel() {
        return "Técnico";
    }
}
