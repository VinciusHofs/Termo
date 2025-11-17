package termo;
import java.util.*;

public class TermoGame {
    public static void main(String[] args) {
        List<String> bancoPalavras = Arrays.asList(
            "CASAL", "TREZE", "FALAR", "PEDRA", "LIVRO",
            "ROSAO", "PLANO", "GASTO", "NIVEL", "SERIO"
        );

        Random random = new Random();
        String palavraAleatoria = bancoPalavras.get(random.nextInt(bancoPalavras.size()));

        PalavraSecreta palavra = new PalavraSecreta(palavraAleatoria);
        Termo jogo = new Termo(palavra);

        jogo.jogar();
    }
}
