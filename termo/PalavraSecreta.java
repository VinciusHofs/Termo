package termo;

public class PalavraSecreta {
    private String palavra;

    public PalavraSecreta(String palavra) {
        this.palavra = palavra.toUpperCase();
    }

    public String getPalavra() {
        return palavra;
    }
}
