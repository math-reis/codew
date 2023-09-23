public class DuplicateEncoder {
    public String encode(String word) {

        char[] listChar = word.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();

        int isDuplicated;

        for (char letter : listChar) {
            isDuplicated = -1;
            for (char out : listChar) {
                if (letter == out) {
                    isDuplicated++;
                }
            }

            if (isDuplicated > 0) {
                letter = ')';
            } else {
                letter = '(';
            }
            sb.append(letter);
        }

        return sb.toString();
    }
}
