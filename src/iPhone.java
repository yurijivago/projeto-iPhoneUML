import java.util.List;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    //atributos
    private Long numeroIMEI;
    private String enderecoMAC;
    private String enderecoIP;
    private int numeroCorreioVoz;

    public iPhone(Long numeroIMEI, String enderecoMAC, String enderecoIP, int numeroCorreioVoz) {
        this.numeroIMEI = numeroIMEI;
        this.enderecoMAC = enderecoMAC;
        this.enderecoIP = enderecoIP;
        this.numeroCorreioVoz = numeroCorreioVoz;
    }

    public Long getNumeroIMEI() {
        return numeroIMEI;
    }

    public String getEnderecoMAC() {
        return enderecoMAC;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public int getNumeroCorreioVoz() {
        return numeroCorreioVoz;
    }

    public void setNumeroCorreioVoz(int numeroCorreioVoz) {
        this.numeroCorreioVoz = numeroCorreioVoz;
    }

    @Override
    public void ligar(Long numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void ligarCorreiVoz() {
        System.out.println("Ligando para o correio de voz (" + getNumeroCorreioVoz() + ")");
    }

    @Override
    public void exibirPagina(String linkPagina) {
        System.out.println("Abrindo a página " + linkPagina);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba...\nNova aba aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...\nPágina atualizada!");
    }

    @Override
    public void tocar(String nomeMusica) {
        System.out.println("Tocando música '" + nomeMusica + "'");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("'" + nomeMusica + "' foi selecionada.");
    }
}
