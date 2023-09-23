public class SpinWords {
    public String spinWords(String sentence) {

        String[] lista;
        lista = sentence.split(" ");
        String[] novaLista = new String[lista.length];
        int posicaoAtual = 0;

        for (String palavra : lista) {

            if (palavra.length() < 5) {
                novaLista[posicaoAtual] = palavra;
                posicaoAtual++;
            }
            if (palavra.length() >= 5) {

                int palavraTamanho = palavra.length();
                char[] palavraLista = new char[palavraTamanho];
                char[] palavraInvertida = new char[palavraTamanho];

                for (int i = 0; i < palavraTamanho; i++) {
                    palavraLista[i] = palavra.charAt(i);
                }

                for (int i = 0; i < palavraTamanho; i++) {
                    palavraInvertida[i] = palavraLista[palavraTamanho - i - 1];
                }
                novaLista[posicaoAtual] = new String(palavraInvertida);
                posicaoAtual++;
            }
        }

        String frase = "";
        for (int i = 0; i < novaLista.length; i++) {
            frase = frase + novaLista[i] + ' ';
        }

        return frase.trim();
    }
}
