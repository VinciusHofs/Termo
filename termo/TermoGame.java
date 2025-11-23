package termo;

public class TermoGame {
    public static void main(String[] args) {
        System.out.println("Iniciando Jogo do Termo...");

        // 1. Usa o BancoDePalavras (OO + Manipulação de Arquivos + Coleção)
        BancoDePalavras banco = new BancoDePalavras();

        // 2. Seleciona a palavra e cria o objeto PalavraSecreta
        String palavraAleatoria = banco.selecionarPalavraAleatoria();
        PalavraSecreta palavra = new PalavraSecreta(palavraAleatoria);

        // 3. Inicia o Jogo
        Termo jogo = new Termo(palavra);
        jogo.jogar();
    }
}