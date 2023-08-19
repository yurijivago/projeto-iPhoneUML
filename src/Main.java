import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone(123465L,
                        "00.12.50.AB",
                        "127.0.0.1",
                        500);

        System.out.println("Correio de voz: " + iphone.getNumeroCorreioVoz());

        iphone.ligar(83988881231L);
        iphone.atender();
        iphone.ligarCorreiVoz();
        iphone.exibirPagina("web.dio.me");
        iphone.novaAba();
        iphone.atualizarPagina();
        iphone.tocar("Sweet Child O' Mine");
        iphone.pausar();
        iphone.selecionarMusica("For The Love Of God");

    }
}
