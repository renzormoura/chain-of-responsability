package padroescomportamentais.chainofresponsability;

public class Main {

    public static void main(String[] args) {
        Suporte engenheiro = new SuporteEngenheiro(null);
        Suporte tecnico = new SuporteTecnico(engenheiro);
        Suporte atendente = new SuporteAtendente(tecnico);

        System.out.println("Senha -> " + atendente.resolverChamado(new Chamado(TipoChamadoSenha.getTipoChamadoSenha())));
        System.out.println("Hardware -> " + atendente.resolverChamado(new Chamado(TipoChamadoHardware.getTipoChamadoHardware())));
        System.out.println("Rede -> " + atendente.resolverChamado(new Chamado(TipoChamadoRede.getTipoChamadoRede())));
        System.out.println("Jurídico -> " + atendente.resolverChamado(new Chamado(TipoChamadoJuridico.getTipoChamadoJuridico())));
    }
}
