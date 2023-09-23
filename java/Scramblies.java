public class Scramblies {
    public boolean scramble(String str1, String str2) {

        char[] listTarget = str1.toCharArray();
        char[] listMain = str2.toCharArray();

        int counter = 0;

        for (char letter : listMain) {
            for (int i = 0; i < listTarget.length; i++) {
                if (listTarget[i] == letter) {
                    listTarget[i] = ' ';
                    counter++;
                    break;
                }
            }
        }

        if (counter == str2.length()) {
            return true;
        } else {
            return false;
        }
    }
}
