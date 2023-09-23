import java.util.ArrayList;
import java.util.List;

public class StringIncrementer {
    public String incrementString(String str) {

        String result = "";

        // Valida String vazia

        if (str == "")
            return result + "1";

        // Converte String para char[]

        char[] digit = str.toCharArray();

        // Separa os números

        List<String> list = new ArrayList<String>();

        for (int i = str.length() - 1; i > 0; i--) {

            char d = digit[i];

            if (d == '0' || d == '1' || d == '2' || d == '3' || d == '4'
                    || d == '5'
                    || d == '6' || d == '7' || d == '8' || d == '9') {

                list.add(String.valueOf(d));
            }
        }

        // Inverte a lista

        char[] novaLista = new char[list.size()];

        int i = 0;

        for (String d : list) {

            int size = list.size() - 1 - i;

            novaLista[size] = d.toCharArray()[0];

            i++;
        }

        // Conta o número de zeros à esquerda

        int zeros = 0;

        while (true) {
            for (char nume : novaLista) {
                if (nume == '0') {
                    zeros++;
                } else {
                    break;
                }
            }
            break;
        }

        // Converte char[] para String

        StringBuilder sb = new StringBuilder();

        for (char c : novaLista) {
            sb.append(c);
        }

        // Verifica se tem números

        int numb = 0;

        if (i > 0) {

            // Converte String para int

            numb = Integer.valueOf(sb.toString());

            numb++;

        }

        // Separa as letras

        List<String> lista = new ArrayList<String>();

        for (int j = 0; j < str.length(); j++) {

            char d = digit[j];

            if (!(d == '0' || d == '1' || d == '2' || d == '3' || d == '4'
                    || d == '5'
                    || d == '6' || d == '7' || d == '8' || d == '9')) {

                lista.add(String.valueOf(d));
            }
        }

        // Adiciona os zeros à esquerda

        if (zeros == 0) {
            lista.add("1");
        }
        if (i != zeros) {
            for (int k = 0; k < zeros; k++) {
                lista.add("0");
            }
        } else {
            for (int k = 1; k < zeros; k++) {
                lista.add("0");
            }
        }

        // Adiciona os números ao final da lista

        lista.add(String.valueOf(numb));

        // Converte List<String> para String

        StringBuilder sbc = new StringBuilder();

        for (String s : lista) {
            sbc.append(s);
        }

        String finaleira = sbc.toString();

        return finaleira;
    }
}
