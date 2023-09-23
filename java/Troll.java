public class Troll {
    public String disemvowel(String str) {

        // String "Matheus" => Char ['M', 'a', 't', 'h', 'e', 'u', 's'])
        char[] listaLetras = str.toCharArray();

        // Lista formatada
        char[] listaFormatada = new char[str.length()];

        // Lista de vogais
        char[] listaVogais = { 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' };

        int i = 0;

        for (char letra : listaLetras) {

            boolean ehVogal = false;

            for (char vogal : listaVogais) {
                if (letra == vogal) {
                    ehVogal = true;
                }
            }

            if (!ehVogal) {
                listaFormatada[i] = letra;
                i++;
            }
        }

        return new String(listaFormatada).trim();

        // Solução simplificada
        // return str.replaceAll("[A,a,E,e,I,i,O,o,U,u]", "");
    }
}
