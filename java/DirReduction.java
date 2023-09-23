public class DirReduction {
    public String[] dirReduc(String[] arr) {

        boolean continuar = false;
        String[] lista = new String[arr.length];
        String[] retorno = new String[0];

        for (int i = 0; i < arr.length; i++) {
            lista[i] = arr[i];
        }

        while (!continuar) {

            for (int i = 0; i < lista.length - 1; i++) {
                if ((lista[i] == "WEST" && lista[i + 1] == "EAST") || (lista[i] == "EAST" && lista[i + 1] == "WEST")
                        || (lista[i] == "NORTH" && lista[i + 1] == "SOUTH")
                        || (lista[i] == "SOUTH" && lista[i + 1] == "NORTH")) {
                    lista[i] = "null";
                    lista[i + 1] = "null";
                }
            }

            // Zera o contador e conta o número de directions válidas
            int count = 0;
            for (String direction : lista) {
                if (direction != "null") {
                    count++;
                }
            }

            // Resseta a lista com o tamanho correto
            retorno = new String[count];

            // Atribui à nova lista as directions válidas
            int index = 0;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != "null") {
                    retorno[index] = lista[i];
                    index++;
                }
            }

            for (int i = 0; i < retorno.length - 1; i++) {
                if ((retorno[i] == "WEST" && retorno[i + 1] == "EAST")
                        || (retorno[i] == "EAST" && retorno[i + 1] == "WEST")
                        || (retorno[i] == "NORTH" && retorno[i + 1] == "SOUTH")
                        || (retorno[i] == "SOUTH" && retorno[i + 1] == "NORTH")) {
                    retorno[i] = "null";
                    retorno[i + 1] = "null";
                }
            }

            int contador = 0;

            // Zera o contador e conta o número de directions válidas
            for (String direction : retorno) {
                if (direction == "null") {
                    contador++;
                }

            }
            if (contador > 0) {

                lista = new String[index];

                for (int i = 0; i < lista.length; i++) {
                    lista[i] = retorno[i];
                }
            } else {
                continuar = true;
            }
        }

        return retorno;
    }
}
