package termo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    private final List<String> palavrasValidas;
    private static final String NOME_ARQUIVO = "palavras.txt"; //Criar mais tarde com os verbos pro jogo

    public BancoDePalavras() {
        this.palavrasValidas = carregarPalavrasDoArquivo();
    }

    private List<String> carregarPalavrasDoArquivo() {
        List<String> palavras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Converte para maiúsculo
                palavras.add(linha.trim().toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar o arquivo de palavras: " + NOME_ARQUIVO);
            System.err.println("Certifique-se de que o arquivo existe no diretório correto.");
        }

        if (palavras.isEmpty()) {
            // Adiciona palavras padrão se o arquivo falhar/estiver vazio
            System.out.println("Atenção: Usando lista de palavras padrão.");
            palavras.add("JAVA");
            palavras.add("CLASSE");
        }
        return palavras;
    }

    public String selecionarPalavraAleatoria() {
        Random random = new Random();
        return palavrasValidas.get(random.nextInt(palavrasValidas.size()));
    }
}