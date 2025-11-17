package termo;
import java.util.Scanner;

public class Termo {
        private PalavraSecreta palavraSecreta;
    private Avaliador avaliador;
    private int tentativasMax = 6;

    public Termo(PalavraSecreta palavra) {
        this.palavraSecreta = palavra;
        this.avaliador = new Avaliador();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JOGO TERMO ===");
        System.out.println("Descubra a palavra de 5 letras! Você tem " + tentativasMax + " tentativas.\n");

        for (int i = 1; i <= tentativasMax; i++) {
            System.out.print("Tentativa " + i + ": ");
            String tentativa = scanner.nextLine().toUpperCase();

            if (tentativa.length() != 5) {
                System.out.println("A palavra deve ter 5 letras!\n");
                i--;
                continue;
            }

            String resultado = avaliador.avaliar(tentativa, palavraSecreta.getPalavra());
            System.out.println(resultado + "\n");

            if (tentativa.equals(palavraSecreta.getPalavra())) {
                System.out.println("🎉 PARABÉNS! Você acertou a palavra!");
                return;
            }
        }

        System.out.println("☹ Você perdeu! A palavra era: " + palavraSecreta.getPalavra());
    }
}
