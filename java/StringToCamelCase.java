public class StringToCamelCase {
    public String toCamelCase(String s) {

        char[] c = ((s.replace('_', ' ')).replace('-', ' ')).toCharArray();

        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] == ' ') {
                c[i] = ((String.valueOf(c[i]).toUpperCase()).toCharArray())[0];
            }
        }

        StringBuilder b = new StringBuilder();

        for (char ch : c) {
            if (ch != ' ') {
                b.append(ch);
            }
        }

        return b.toString();
    }
}
