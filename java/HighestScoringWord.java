public class HighestScoringWord {

    public String high(String s) {

        s = "unuagpubggeqpwa xwzqmimepn";

        String[] palavras = s.split(" ");

        int i = 0;

        int[] valorPalavras = new int[palavras.length];

        // Itera por cada palavra da frase
        for (String palavra : palavras) {

            int valorPalavra = 0;

            // Itera por cada letra da palavra
            for (char letra : palavra.toCharArray()) {

                // Compara a letra da palavra com cada letra do alfabeto
                switch (letra) {
                    case 'a':
                        valorPalavra = valorPalavra
                                + 1;
                        break;
                    case 'b':
                        valorPalavra = valorPalavra
                                + 2;
                        break;
                    case 'c':
                        valorPalavra = valorPalavra
                                + 3;
                        break;
                    case 'd':
                        valorPalavra = valorPalavra
                                + 4;
                        break;
                    case 'e':
                        valorPalavra = valorPalavra
                                + 5;
                        break;
                    case 'f':
                        valorPalavra = valorPalavra
                                + 6;
                        break;
                    case 'g':
                        valorPalavra = valorPalavra
                                + 7;
                        break;
                    case 'h':
                        valorPalavra = valorPalavra
                                + 8;
                        break;
                    case 'i':
                        valorPalavra = valorPalavra
                                + 9;
                        break;
                    case 'j':
                        valorPalavra = valorPalavra
                                + 10;
                        break;
                    case 'k':
                        valorPalavra = valorPalavra
                                + 11;
                        break;
                    case 'l':
                        valorPalavra = valorPalavra
                                + 12;
                        break;
                    case 'm':
                        valorPalavra = valorPalavra
                                + 13;
                        break;
                    case 'n':
                        valorPalavra = valorPalavra
                                + 14;
                        break;
                    case 'o':
                        valorPalavra = valorPalavra
                                + 15;
                        break;
                    case 'p':
                        valorPalavra = valorPalavra
                                + 16;
                        break;
                    case 'q':
                        valorPalavra = valorPalavra
                                + 17;
                        break;
                    case 'r':
                        valorPalavra = valorPalavra
                                + 18;
                        break;
                    case 's':
                        valorPalavra = valorPalavra
                                + 19;
                        break;
                    case 't':
                        valorPalavra = valorPalavra
                                + 20;
                        break;
                    case 'u':
                        valorPalavra = valorPalavra
                                + 21;
                        break;
                    case 'v':
                        valorPalavra = valorPalavra
                                + 22;
                        break;
                    case 'w':
                        valorPalavra = valorPalavra
                                + 23;
                        break;
                    case 'x':
                        valorPalavra = valorPalavra
                                + 24;
                    case 'y':
                        valorPalavra = valorPalavra
                                + 25;
                    case 'z':
                        valorPalavra = valorPalavra
                                + 26;
                        break;
                    default:
                        break;
                }

            }

            valorPalavras[i] = valorPalavra;

            i++;
        }

        int maiorValor = valorPalavras[0];
        int indexMaiorValor = 0;

        // Verifica o maior valor das palavras
        for (int j = 0; j < valorPalavras.length; j++) {
            if (valorPalavras[j] > maiorValor) {
                maiorValor = valorPalavras[j];
                indexMaiorValor = j;
            }
        }

        return palavras[indexMaiorValor];
    }
}
