package termo;

public class Avaliador {
    public String avaliar(String tentativa, String secreta) {
        tentativa = tentativa.toUpperCase();
        secreta = secreta.toUpperCase();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < tentativa.length(); i++) {
            char letra = tentativa.charAt(i);

            if (letra == secreta.charAt(i)) {
                resultado.append("V"); // letra certa, posição certa
            } else if (secreta.contains(String.valueOf(letra))) {
                resultado.append("O"); // letra existe, posição errada
            } else {
                resultado.append("X"); // letra não existe
            }
        }
    return resultado.toString();
    }
}
